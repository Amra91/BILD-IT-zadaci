package Projekat4_Hangman_Battleship;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Hangman  extends Application {
	List<Image> list = new ArrayList<Image>();
	ArrayList<String> listUnijetih = new ArrayList<>();
	 
	 
	 //Niz koji sadrzi rijeci koje se pogadjaju
	 String[] arr = {"dino", "amra" , "nesto","bild","film", "Cekaj"};
	 //Izvlacenje random rijeci iz String niza
	 String theWord = arr[(int)(Math.random()*6)].toUpperCase();
	 
	 char[] arrr = ne();	//Niz u kojem svako slovo iz trazene rijeci je '_' [kasnije se mijenja]
	 String s = "", letterGuessed = "";
	 int brojac_slika = 0, brojac_pogresnih = 0, br_listUnijetih = 0;
	 
	 //Brojac pomocu kojeg provjeravamo prvi unos sa tastature
	 int brojac = 0;	
	 //Boolean varijable koje sluze za provjeru broja pogresnih poteza[samo ako su oba false ostvaruje se pogresan potez]
	 boolean status = true, status2 = true;
	
	
	@Override
	public void start(Stage stage) {
		 loadImages(); 				//Ucitavanje slika
		 
		//Kreiranje objekta za zvuk kada izgubimo
		MediaPlayer smijeh = new MediaPlayer(new Media(new File("smijeh.WAV").toURI().toString()));
		Pane pane = new Pane();
		
		StackPane stackPane = new StackPane();
		Label label2 = new Label();
		Button play = new Button("Play again");
		File file = new File("hangman.gif");
		Image image = new Image(file.toURI().toString());
		ImageView im_v = new ImageView(image);
		
		stackPane.getChildren().add(im_v);
		stackPane.setStyle("-fx-background-color: black;");
		stackPane.setLayoutX(50);
		stackPane.setLayoutY(0);
		pane.getChildren().add(stackPane);
		pane.setStyle("-fx-background-color: black");
		
		
		
		//Kreiranje uvodne scene i dodavanje na scenu pane koji sadrzi sve za uvodni dio igrice
		Scene scene = new Scene(pane,500,540);	
		
		String musicFile = "igrica.WAV";
		//Kreiranje MediaPlayer objekta
		MediaPlayer mediaPlayer = new MediaPlayer(new Media(new File(musicFile).toURI().toString()));
		//Postavka uvodne muzike da se nikad ne zaustavlja
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer.play();		//Pustanje uvodne muzike
		
		//Postavka i uredjivanje glavne naljepnice 
		Label label = new Label(sentenceToGuess());
		label.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 30));
		label.setTranslateY(350);
		label.setTranslateX(150);
		label.setStyle("-fx-background-insets: 10; " +
				"-fx-background-radius: 10; " +
				"-fx-effect: dropshadow(three-pass-box, purple, 10, 0, 0, 0);");
		
		
		Pane pane2 = new Pane();				//Kreiranje pane2 objekta u kojeg spremamo sve za glavni prozor igrice
		
		//Uredjivanje pane2 prozora sa css kodom
		pane2.setStyle("-fx-background-color: white");
		pane2.setStyle( "-fx-background-color: rgba(255, 255, 255, 0.4);" +
                "-fx-effect: dropshadow(gaussian, red, 50, 0, 0, 0);" 
            	);
		
		
		//Kreiranje StackPane objekta u kojem cemo prikazivati slike
		StackPane stack = new StackPane();
		stack.setPrefWidth(200);					//Postavljanje sirine StackPane
		stack.setPrefHeight(200);					//Postavljanje visine StackPane
		stack.setTranslateX(110);					//Pozicioniranje stack po X osi
		stack.setTranslateY(20);					//Pozicioniranje stack po Y osi
		
		//Prikaz pocetne slike kada se pokrene igrica[ slika: prazno vjesalo ..]
		if(brojac_slika <1){
			ImageView im = new ImageView(list.get(brojac_slika));
			im.setImage(list.get(brojac_slika));	//Eksplicitno postavljanje slike u ImageView objekat
			im.setFitHeight(300);					//Postavljanje visine slike
			im.setFitWidth(220);					//Postavljanje sirine slike
			stack.getChildren().add(im);			//Postavljanje slike u stack
			}
			//Uredjivanje stack[sadzi mjesto za prikaz slika] sa css kodom
			stack.setStyle( "-fx-background-color: rgba(255, 255, 255, 0.4);" +
                "-fx-effect: dropshadow(gaussian, red, 50, 0, 0, 0);"+
					"-fx-position: absolute;"
            	);
		
		
		
		
		label2.setTranslateX(140);		//Pozicioniranje naljepnice po X osi
		label2.setTranslateY(400);		//Pozicioniranje naljepnice po Y osi
		//Postavljanje fonta naljepnice i velicine slova
		label2.setFont(Font.font("Arial", FontWeight.BOLD,FontPosture.ITALIC, 20));
		label2.setTextFill(Color.RED);	//Postavljane boje slova
		//Uredjivanje naljepnice sa css kodom
		label2.setStyle("-fx-background-insets: 10; " +
						"-fx-background-radius: 10; " +
						"-fx-effect: dropshadow(three-pass-box, green, 10, 0, 0, 0);");
		
		play.setTranslateX(150);		//Pozicioniranje dugmeta po X osi
		play.setTranslateY(430);		//Pozicioniranje dugmeta po Y osi
		play.setPrefWidth(100);			//Postavljanje sirine
		play.setVisible(false);			//Sakrivanje dugmeta[prikazuje se kada se ostvari pobjeda ili poraz]
		//Uredjivanje dugmeta sa css kodom
		play.setStyle( "-fx-font: bold italic 10pt Arial;"+
						"-fx-effect: dropshadow( two-pass-box , red , 8 , 0.0 , 2 , 0 );");

		
		pane2.getChildren().addAll(label,stack,label2,play);	//Dodavanje u "pane" sve za glavni dio igrice[mjesto za slike, naljepnice, dugme]
		
		//Kreiranje nove scene i dodavanje u scenu "pane" koji sadrzi glavni dio igrice
		Scene scene2 = new Scene(pane2, 420, 500);		
		
		//Postavljanje akcije za igricu
        scene2.setOnKeyPressed(e -> {
        	
        		//Provjeravamo da li je korisnik unio slovo,
        		if(provjeraUnosaDaJeSlovo(e) == true){
        			game(label, label2, e,play,stack,smijeh);
        		}else{
        			label2.setText("Samo slova dopustena");
        		}
        		
        });
        
        play.setOnAction(x ->{
        	smijeh.stop();			//Zaustavljamo muziku kada se dugme pritisne
        	stage.close();			
            Platform.runLater( () -> new Hangman().start( stage ) );	//Pokrecemo igricu ponovo
        	
        });
      
        //Postavljanje akcije za pocetak igrice
		scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
		
	        public void handle(MouseEvent event) {
	        	mediaPlayer.stop();		//Zaustavljanje muzike
	        	
	            stage.setScene(scene2);	//Postavljanje nove scene
	            stage.sizeToScene();	//Postavljanje velicine stage na velicinu scene
	            stage.show();			//Prikaz stage
	          
	        }
	    });
		
		stage.setScene(scene);			//Postavljanje pocetne scene na pozornicu(stage)
		stage.setResizable(false);		//Zabrana mjenjanja velicine prozora
		
		stage.setTitle("Welcome to HANGMAN GAME [click to play]");
		stage.show();
	}
	
	//Metoda koja popunjava rijec koja se pogadja
	 public String fillWord(String lett) {
		 char[] ch = new char[theWord.length()]; 		  //Deklarisemo karakterni niz velicine rijeci koja se pogadja
	      
	       for(int i=0; i<ch.length; i++){
	        	 //Dodjeljujemo u karakterni niz svako slovo iz rijeci koja se pogadja
	        	ch[i] = theWord.charAt(i);
	        }
	       
	       //Prebacujemo slovo koje unosimo sa tastature u karakterni niz
	        char[] let = lett.toCharArray();
	        
	        
	       
	        	//Provjera da li postoji unijeto slovo sa tastature u trazenoj rijeci
	        for(int j=0; j<ch.length; j++){
	        	//Ako postoji unijeto slovo u trazenoj rijeci
	        	if(ch[j] == let[0] && arrr[j] == '_' ){
	        		
	        		arrr[j] = let[0];	//Mijenjamo crticu u unijeto slovo sa tastature
	        							//arrr je karakterni niz koji sadrzi sve '_' za sva slova
	        							//u trazenoj rijeci
	        	 
	        	 
	        	}
	         }	
	        String str = "";		//Deklarisanje novog stringa za radi oblikovanja
	        for(int i=0; i<arrr.length; i++){
	        		str += arrr[i]+"  ";	//Oblikujemo izgled stringa
	        		
	        	}
	        	
	        	return str;
	    }
	 //Metoda koja sluzi samo za pocetno prikazivanje trazene rijeci 
	 //Metoda mijenja svako slovo u '_' i kao takvu prikazuje korisniku
	public String sentenceToGuess(){
		String str = "";
		for(int i=0; i<theWord.length(); i++){
			str += "_ "+" ";
		}
		return str;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	//Metoda koja vraca karakterni niz od trazene rijeci, u kojem je svako slovo zamjenjeno sa '_'
	public char[]  ne(){
		char[] ch1 = new char[theWord.length()];
		for(int i=0; i<ch1.length; i++){
	     	ch1[i] = '_';
	     }
		return ch1;
	}
	//Metoda provjerava da li smo dobili trazenu rijec
	public boolean provjera(){
		boolean status = true;
		for(int i=0; i<arrr.length; i++){
			if(arrr[i] == '_'){
				status = false;
			}
		}
		return status;
	}
	//Metoda sprema svako ne ponovljeno slovo u ArrayList
	public void storeLetters(String letter,Label label2){
		boolean status = false;
		
		for(String l : listUnijetih){
			if(l.contains(letter.toUpperCase())){
				status = true;
				 
				System.out.println("To slovo je vec iskoristeno");
				label2.setText("Slovo je iskoristeno");
			}
			else{
				status = false;
				
			}
		}
		
		
		//Provjera da li je unijeto slovo koristeno ako nije sprema se u ArrayList
		if(status == false){
		listUnijetih.add(br_listUnijetih, letter.toUpperCase());
		br_listUnijetih++;
		}
		
		
	}
	//Metoda provjera da li unijeto slovo postoji u trazenoj rijeci i broji pogresne unose
	public int brojacPogresnih(String letter,StackPane stack){
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == letterGuessed.toUpperCase().charAt(0)){
				status2 = true;
				break;
			}else{
				status2 = false;
			}
			
		}
		for(int i=0; i<1; i++){
			for(int j=0; j<theWord.length(); j++){
				if(theWord.charAt(j) == letterGuessed.toUpperCase().charAt(0)){
					status = true;
					break;
				}else{
					status = false;
					
				}
			}
			
		}
		
		
		if(brojac < 1){
			if(status == false){
				brojac_pogresnih++;
				System.out.println("Prva if "+brojac_pogresnih);
				brojac_slika++;
				stack.getChildren().add(image(brojac_slika));
				
			}
			brojac++;
		}else{
			if(status == false && status2 == false){
				brojac_pogresnih++;
				brojac_slika++;
				if(brojac_slika > 6){
					stack.getChildren().add(image(6));
				}else{
				stack.getChildren().add(image(brojac_slika));
				}
				System.out.println(brojac_pogresnih);
			}
		}
		System.out.println(status+","+status2);
		return brojac_pogresnih;
	}
	
	//Metoda kreira i vraca ImageView objekat koji sluzi za prikazivanje slike,
	public ImageView image(int br){
		
		ImageView imageView = new ImageView(list.get(br));
		//Postavljane slike u ImageView objekat
		imageView.setImage(list.get(br));
		imageView.setFitHeight(300);		//Postavljanje visine slike
		imageView.setFitWidth(220);			//Postavljanje sirine slike
		return imageView;
	}
	//Glavna metoda
	public void game(Label label, Label label2, KeyEvent e,Button play,StackPane stack,MediaPlayer smijeh){
		 	label2.setText("");					
		 	letterGuessed = e.getText();							//Spremanje unijetog slova u string
		 	storeLetters(letterGuessed,label2);					//Spremanje unijetog slova[metoda ujedno i provjerava da li je unos validan]
		 	String str = fillWord(letterGuessed.toUpperCase());	//Spremanje promjene u string koji ce se prikazati korisniku
		 	int br = brojacPogresnih(letterGuessed,stack);			//Spremanje broja pogresnih poteza u int varijablu
    	 
		 	System.out.println(Arrays.toString(arrr));				//Print za konzolu[nije potreban]
    	
    	 //Provjera da li smo ostvarili pobjedu
    	 if(provjera() == true){
    			//Ako je pobjeda ostvarena pokazujemo dugme korisniku da ako zeli ponovo da igra
    			play.setVisible(true);				
    			label2.setText("Pobjedio si ");	//Printanje rezultata korisniku
    			 
    		 }
    	 	
    	 //Provjera broja pogresnih poteza
    	 //else blok se izvrsava kada izgubimo
    	 if(br <= 5){
    		 	s=s+letterGuessed.toUpperCase();
    			label.setText(str);
    			 
    		}else{
    			
    			smijeh.play();									//Pustanje muzike kada je game over
    			smijeh.setCycleCount(MediaPlayer.INDEFINITE);	//Postavljanje muzike da se ponavlja stalno
    			play.setVisible(true);							//Prikazivanje dugmeta za ponovno igranje
    			label2.setText("Objesen si !!");				//Prikaz rezultata korisniku
    		}
    }
	//Metoda koja provjerava da li je korisnik unio slovo ili neki znak, broj...
	//Metoda dopusta samo da se slovo unese
	public boolean provjeraUnosaDaJeSlovo(KeyEvent e){
		boolean status = false;
		String str = e.getText();
		if(Character.isLetter(str.charAt(0))){
			status = true;
		}
		return status;
	}
	 //Metoda ucitava slike
	 private void loadImages(){
		 for(int i=0; i<7; i++){
			 list.add(new Image(new File("igra"+i+".jpg").toURI().toString()));
		 }
	 }
}
