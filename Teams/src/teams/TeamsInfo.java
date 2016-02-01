/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author: Ian Cunnngham
 * @student Number: x13114425
 * @File: TeamsInfo.java
 */
public class TeamsInfo extends javax.swing.JFrame {
    /**
     * Creates new form TeamsInfo
     */
    
    //arrayList and variables that will be stored in each object
    private ArrayList <Squad> squadList;
    private String teamName;
    private String player1;
    private String player2;
    private String player3;
    private String player4;
    private String player5;
    private String player6;
    private String player7;
    private String player8;
    private String player9;
    private String player10;
    private String player11;
    private String player12;
    private String player13;
    private String player14;
    private String player15;
    private String player16;
    private String player17;
    private String player18;
    private String player19;
    private String player20;
    private String player21;
    private String player22;
    private String player23;
    private String flag;
    private int count;
    
    //array of objects and variables that will be stored in each object
    TeamInformation[] info;
    private String managerPic;
    private String managerName;
    private int managerAge;
    private String managerNation;
    private String captainPic;
    private String captainName;
    private int captainAge;
    private String captainClub;
    private String starPic;
    private String starName;
    private int starAge;
    private String starClub;
    
    public TeamsInfo() {
        initComponents();
        squadList = new ArrayList <>();
        teamName = new String();
        player1 = new String();
        player2 = new String();
        player3 = new String();
        player4 = new String();
        player5 = new String();
        player6 = new String();
        player7 = new String();
        player8 = new String();
        player9 = new String();
        player10 = new String();
        player11 = new String();
        player12 = new String();
        player13 = new String();
        player14 = new String();
        player15 = new String();
        player16 = new String();
        player17 = new String();
        player18 = new String();
        player19 = new String();
        player20 = new String();
        player21 = new String();
        player22 = new String();
        player23 = new String();
        flag = new String();
        count = 0;
        
        searchBtn.setVisible(false);
        searchTF.setVisible(false);
        teamsBtn.setVisible(false);
        home2Btn.setVisible(false);
        
        info = new TeamInformation[32];
        managerPic = new String();
        managerName = new String();
        managerAge = 0;
        managerNation = new String();
        captainPic = new String();
        captainName = new String();
        captainAge = 0;
        captainClub = new String();
        starPic = new String();
        starName = new String();
        starAge = 0;
        starClub = new String();
    }
    
    //methods that will add each countrys squad object to the arrayList
    public void englandSquad(){
        teamName = "England";
        player1 = "Joe Hart";
        player2 = "Frazer Foster";
        player3 = "Ben Foster";
        player4 = "Glen Johnson";
        player5 = "Kyle Walker";
        player6 = "Gary Cahill";
        player7 = "Chris Smalling";
        player8 = "Phil Jones";
        player9 = "Phil Jagielka";
        player10 = "Leighton Baines";
        player11 = "Luke Shaw";
        player12 = "Adam Lallana";
        player13 = "Andros Townsend";
        player14 = "Steven Gerrard";
        player15 = "Jack Wilshere";
        player16 = "Michael Carrick";
        player17 = "Frank Lampard";
        player18 = "Alex-Oxlade-Chamberlain";
        player19 = "Raheem Sterling";
        player20 = "Rickie Lambert";
        player21 = "Jay Rodriguez";
        player22 = "Daniel Sturridge";
        player23 = "Wayne Rooney";
        flag = "/teams/pictures/engFlag.gif";
        
        Squad englandSquad = new Squad();
        englandSquad.setTeamName(teamName);
        englandSquad.setPlayer1(player1);
        englandSquad.setPlayer2(player2);
        englandSquad.setPlayer3(player3);
        englandSquad.setPlayer4(player4);
        englandSquad.setPlayer5(player5);
        englandSquad.setPlayer6(player6);
        englandSquad.setPlayer7(player7);
        englandSquad.setPlayer8(player8);
        englandSquad.setPlayer9(player9);
        englandSquad.setPlayer10(player10);
        englandSquad.setPlayer11(player11);
        englandSquad.setPlayer12(player12);
        englandSquad.setPlayer13(player13);
        englandSquad.setPlayer14(player14);
        englandSquad.setPlayer15(player15);
        englandSquad.setPlayer16(player16);
        englandSquad.setPlayer17(player17);
        englandSquad.setPlayer18(player18);
        englandSquad.setPlayer19(player19);
        englandSquad.setPlayer20(player20);
        englandSquad.setPlayer21(player21);
        englandSquad.setPlayer22(player22);
        englandSquad.setPlayer23(player23);
        englandSquad.setFlag(flag);
        
        squadList.add(englandSquad);
        
        count++;
    }
    
    public void spainSquad(){
        teamName = "Spain";
        player1 = "Iker Casillas";
        player2 = "Victor Valdes";
        player3 = "David de Gea";
        player4 = "Alvaro Arbeloa";
        player5 = "César Azpilicueta";
        player6 = "Sergio Ramos";
        player7 = "Gerard Piqué";
        player8 = "Inigo Martinez";
        player9 = "Raúl Albiol";
        player10 = "Jordi Alba";
        player11 = "Nacho Monreal";
        player12 = "Santi Cazorla";
        player13 = "Jesús Navas";
        player14 = "Cesc Fàbregas";
        player15 = "Xavi Hernández";
        player16 = "Xabi Alonso";
        player17 = "Sergio Busquets";
        player18 = "David Silva";
        player19 = "Andrés Iniesta";
        player20 = "Pedro Rodríguez";
        player21 = "Álvaro Negredo";
        player22 = "Diego Costa";
        player23 = "David Villa";
        flag = "/teams/pictures/spainFlag.gif";
        
        Squad spainSquad = new Squad();
        spainSquad.setTeamName(teamName);
        spainSquad.setPlayer1(player1);
        spainSquad.setPlayer2(player2);
        spainSquad.setPlayer3(player3);
        spainSquad.setPlayer4(player4);
        spainSquad.setPlayer5(player5);
        spainSquad.setPlayer6(player6);
        spainSquad.setPlayer7(player7);
        spainSquad.setPlayer8(player8);
        spainSquad.setPlayer9(player9);
        spainSquad.setPlayer10(player10);
        spainSquad.setPlayer11(player11);
        spainSquad.setPlayer12(player12);
        spainSquad.setPlayer13(player13);
        spainSquad.setPlayer14(player14);
        spainSquad.setPlayer15(player15);
        spainSquad.setPlayer16(player16);
        spainSquad.setPlayer17(player17);
        spainSquad.setPlayer18(player18);
        spainSquad.setPlayer19(player19);
        spainSquad.setPlayer20(player20);
        spainSquad.setPlayer21(player21);
        spainSquad.setPlayer22(player22);
        spainSquad.setPlayer23(player23);
        spainSquad.setFlag(flag);
        
        squadList.add(spainSquad);
        
        count++;
    }
    
    public void germanySquad(){
        teamName = "Germany";
        player1 = "Manuel Neuer";
        player2 = "Marc-André ter Stegen";
        player3 = "Ron-Robert Zieler";
        player4 = "Philipp Lahm";
        player5 = "Jérôme Boateng";
        player6 = "Per Mertesacker";
        player7 = "Holger Badstuber";
        player8 = "Benedikt Höwedes";
        player9 = "Mats Hummels";
        player10 = "Marcel Schmelzer";
        player11 = "Marcell Jansen";
        player12 = "Marco Reus";
        player13 = "Julian Draxler";
        player14 = "Bastian Schweinsteiger";
        player15 = "İlkay Gündoğan";
        player16 = "Toni Kroos";
        player17 = "Sami Khedira";
        player18 = "Mario Götze";
        player19 = "Mesut Özil";
        player20 = "André Schürrle";
        player21 = "Thomas Müller";
        player22 = "Lukas Podolski";
        player23 = "Mario Gomez";
        flag = "/teams/pictures/gerFlag.gif";
        
        Squad germanySquad = new Squad();
        germanySquad.setTeamName(teamName);
        germanySquad.setPlayer1(player1);
        germanySquad.setPlayer2(player2);
        germanySquad.setPlayer3(player3);
        germanySquad.setPlayer4(player4);
        germanySquad.setPlayer5(player5);
        germanySquad.setPlayer6(player6);
        germanySquad.setPlayer7(player7);
        germanySquad.setPlayer8(player8);
        germanySquad.setPlayer9(player9);
        germanySquad.setPlayer10(player10);
        germanySquad.setPlayer11(player11);
        germanySquad.setPlayer12(player12);
        germanySquad.setPlayer13(player13);
        germanySquad.setPlayer14(player14);
        germanySquad.setPlayer15(player15);
        germanySquad.setPlayer16(player16);
        germanySquad.setPlayer17(player17);
        germanySquad.setPlayer18(player18);
        germanySquad.setPlayer19(player19);
        germanySquad.setPlayer20(player20);
        germanySquad.setPlayer21(player21);
        germanySquad.setPlayer22(player22);
        germanySquad.setPlayer23(player23);
        germanySquad.setFlag(flag);
        
        squadList.add(germanySquad);
        
        count++;
    }
    
    public void belgiumSquad(){
        teamName = "Belgium";
        player1 = "Thibaut Courtois";
        player2 = "Simon Mignolet";
        player3 = "Jean-François Gillet";
        player4 = "Nicolas Lombaerts";
        player5 = "Daniel Van Buyten";
        player6 = "Jan Vertonghen";
        player7 = "Toby Alderweireld";
        player8 = "Thomas Vermaelen";
        player9 = "Vincent Kompany";
        player10 = "Laurent Ciman";
        player11 = "Sébastien Pocognoli";
        player12 = "Eden Hazard";
        player13 = "Kevin Mirallas";
        player14 = "Steven Defour";
        player15 = "Marouane Fellaini";
        player16 = "Mousa Dembélé";
        player17 = "Axel Witsel";
        player18 = "Nacer Chadli";
        player19 = "Kevin De Bruyne";
        player20 = "Christian Benteke";
        player21 = "Dries Mertens";
        player22 = "Ilombe Mboyo";
        player23 = "Romelu Lukaku";
        flag = "/teams/pictures/belFlag.gif";
        
        Squad belgiumSquad = new Squad();
        belgiumSquad.setTeamName(teamName);
        belgiumSquad.setPlayer1(player1);
        belgiumSquad.setPlayer2(player2);
        belgiumSquad.setPlayer3(player3);
        belgiumSquad.setPlayer4(player4);
        belgiumSquad.setPlayer5(player5);
        belgiumSquad.setPlayer6(player6);
        belgiumSquad.setPlayer7(player7);
        belgiumSquad.setPlayer8(player8);
        belgiumSquad.setPlayer9(player9);
        belgiumSquad.setPlayer10(player10);
        belgiumSquad.setPlayer11(player11);
        belgiumSquad.setPlayer12(player12);
        belgiumSquad.setPlayer13(player13);
        belgiumSquad.setPlayer14(player14);
        belgiumSquad.setPlayer15(player15);
        belgiumSquad.setPlayer16(player16);
        belgiumSquad.setPlayer17(player17);
        belgiumSquad.setPlayer18(player18);
        belgiumSquad.setPlayer19(player19);
        belgiumSquad.setPlayer20(player20);
        belgiumSquad.setPlayer21(player21);
        belgiumSquad.setPlayer22(player22);
        belgiumSquad.setPlayer23(player23);
        belgiumSquad.setFlag(flag);
        
        squadList.add(belgiumSquad);
        
        count++;
    }
    
    public void franceSquad(){
        teamName = "France";
        player1 = "Hugo Lloris";
        player2 = "Steve Mandanda";
        player3 = "Stephane Ruffier";
        player4 = "Bacary Sagna";
        player5 = "Raphael Varane";
        player6 = "Laurent Koscielny";
        player7 = "Mamadou Sakho";
        player8 = "Adil Rami";
        player9 = "Eliaquim Mangala";
        player10 = "Gael Clichy";
        player11 = "Patrice Evra";
        player12 = "Jeremy Menez";
        player13 = "Hatem Ben Arfa";
        player14 = "Paul Pogba";
        player15 = "Yohan Cabaye";
        player16 = "Moussa Sissoko";
        player17 = "Blaise Matuidi";
        player18 = "Samir Nasri";
        player19 = "Franck Ribery";
        player20 = "Bafetimbi Gomis";
        player21 = "Loic Remy";
        player22 = "Olivier Giroud";
        player23 = "Karim Benzema";
        flag = "/teams/pictures/fraFlag.gif";
        
        Squad franceSquad = new Squad();
        franceSquad.setTeamName(teamName);
        franceSquad.setPlayer1(player1);
        franceSquad.setPlayer2(player2);
        franceSquad.setPlayer3(player3);
        franceSquad.setPlayer4(player4);
        franceSquad.setPlayer5(player5);
        franceSquad.setPlayer6(player6);
        franceSquad.setPlayer7(player7);
        franceSquad.setPlayer8(player8);
        franceSquad.setPlayer9(player9);
        franceSquad.setPlayer10(player10);
        franceSquad.setPlayer11(player11);
        franceSquad.setPlayer12(player12);
        franceSquad.setPlayer13(player13);
        franceSquad.setPlayer14(player14);
        franceSquad.setPlayer15(player15);
        franceSquad.setPlayer16(player16);
        franceSquad.setPlayer17(player17);
        franceSquad.setPlayer18(player18);
        franceSquad.setPlayer19(player19);
        franceSquad.setPlayer20(player20);
        franceSquad.setPlayer21(player21);
        franceSquad.setPlayer22(player22);
        franceSquad.setPlayer23(player23);
        franceSquad.setFlag(flag);
        
        squadList.add(franceSquad);
        
        count++;
    }
    
    public void hollandSquad(){
        teamName = "Holland";
        player1 = "Maarten Stekelenburg";
        player2 = "Michel Vorm";
        player3 = "Kenneth Vermeer";
        player4 = "Ricardo van Rhijn";
        player5 = "Daryl Jammatt";
        player6 = "Ron Vlarr";
        player7 = "John Heitinga";
        player8 = "Bruno Martins Indi";
        player9 = "Jeffrey Bruma";
        player10 = "Stefan de Vrij";
        player11 = "Daly Blind";
        player12 = "Arjen Robben";
        player13 = "Jordy Clasie";
        player14 = "Wesley Sneijder";
        player15 = "Jonathon de Guzman";
        player16 = "Nigel de Jong";
        player17 = "Kevin Strootman";
        player18 = "Rafael van der Vaart";
        player19 = "Ibrahim Afellay";
        player20 = "Dirk Kuyt";
        player21 = "Jeremain Lens";
        player22 = "Klaas-Jan Huntelaar";
        player23 = "Robin van Persie";
        flag = "/teams/pictures/holFlag.gif";
        
        Squad hollandSquad = new Squad();
        hollandSquad.setTeamName(teamName);
        hollandSquad.setPlayer1(player1);
        hollandSquad.setPlayer2(player2);
        hollandSquad.setPlayer3(player3);
        hollandSquad.setPlayer4(player4);
        hollandSquad.setPlayer5(player5);
        hollandSquad.setPlayer6(player6);
        hollandSquad.setPlayer7(player7);
        hollandSquad.setPlayer8(player8);
        hollandSquad.setPlayer9(player9);
        hollandSquad.setPlayer10(player10);
        hollandSquad.setPlayer11(player11);
        hollandSquad.setPlayer12(player12);
        hollandSquad.setPlayer13(player13);
        hollandSquad.setPlayer14(player14);
        hollandSquad.setPlayer15(player15);
        hollandSquad.setPlayer16(player16);
        hollandSquad.setPlayer17(player17);
        hollandSquad.setPlayer18(player18);
        hollandSquad.setPlayer19(player19);
        hollandSquad.setPlayer20(player20);
        hollandSquad.setPlayer21(player21);
        hollandSquad.setPlayer22(player22);
        hollandSquad.setPlayer23(player23);
        hollandSquad.setFlag(flag);
        
        squadList.add(hollandSquad);
        
        count++;
    }
    
    public void bosniaSquad(){
        teamName = "Bosnia";
        player1 = "Asmir Begović";
        player2 = "Ibrahim Šehić";
        player3 = "Jasmin Fejzic";
        player4 = "Senad Lulić";
        player5 = "Boris Pandža";
        player6 = "Emir Spahić";
        player7 = "Avdija Vršajević";
        player8 = "Ognjen Vranješ";
        player9 = "Toni Šunjić";
        player10 = "Ervin Zukanovic";
        player11 = "Muhamed Bešić";
        player12 = "Edin Višća";
        player13 = "Elvir Rahimić";
        player14 = "Sejad Salihović";
        player15 = "Miralem Pjanić";
        player16 = "Adnan Zahirović";
        player17 = "Zvjezdan Misimović";
        player18 = "Haris Medunjanin";
        player19 = "Mensur Mujdža";
        player20 = "Senijad Ibričić";
        player21 = "Miroslav Stevanović";
        player22 = "Vedad Ibišević";
        player23 = "Edin Džeko";
        flag = "/teams/pictures/bosnFlag.gif";
        
        Squad bosniaSquad = new Squad();
        bosniaSquad.setTeamName(teamName);
        bosniaSquad.setPlayer1(player1);
        bosniaSquad.setPlayer2(player2);
        bosniaSquad.setPlayer3(player3);
        bosniaSquad.setPlayer4(player4);
        bosniaSquad.setPlayer5(player5);
        bosniaSquad.setPlayer6(player6);
        bosniaSquad.setPlayer7(player7);
        bosniaSquad.setPlayer8(player8);
        bosniaSquad.setPlayer9(player9);
        bosniaSquad.setPlayer10(player10);
        bosniaSquad.setPlayer11(player11);
        bosniaSquad.setPlayer12(player12);
        bosniaSquad.setPlayer13(player13);
        bosniaSquad.setPlayer14(player14);
        bosniaSquad.setPlayer15(player15);
        bosniaSquad.setPlayer16(player16);
        bosniaSquad.setPlayer17(player17);
        bosniaSquad.setPlayer18(player18);
        bosniaSquad.setPlayer19(player19);
        bosniaSquad.setPlayer20(player20);
        bosniaSquad.setPlayer21(player21);
        bosniaSquad.setPlayer22(player22);
        bosniaSquad.setPlayer23(player23);
        bosniaSquad.setFlag(flag);
        
        squadList.add(bosniaSquad);
        
        count++;
    }
    
    public void croatiaSquad(){
        teamName = "Croatia";
        player1 = "Stipe Pletikosa";
        player2 = "Ivan Kelava";
        player3 = "Danijel Subašić";
        player4 = "Vedran Ćorluka";
        player5 = "Josip Šimunić";
        player6 = "Domagoj Vida";
        player7 = "Ivan Strinić";
        player8 = "Gordon Schildenfeld";
        player9 = "Dejan Lovren";
        player10 = "Mateo Pavlović";
        player11 = "Manuel Pamić";
        player12 = "Mateo Kovačić";
        player13 = "Alen Halilović";
        player14 = "Luka Modrić";
        player15 = "Darijo Srna";
        player16 = "Ivan Rakitić";
        player17 = "Ognjen Vukojević";
        player18 = "Ivan Perišić";
        player19 = "Niko Kranjčar";
        player20 = "Ivica Olić";
        player21 = "Nikica Jelavić";
        player22 = "Eduardo";
        player23 = "Mario Mandžukić";
        flag = "/teams/pictures/croFlag.gif";
        
        Squad croatiaSquad = new Squad();
        croatiaSquad.setTeamName(teamName);
        croatiaSquad.setPlayer1(player1);
        croatiaSquad.setPlayer2(player2);
        croatiaSquad.setPlayer3(player3);
        croatiaSquad.setPlayer4(player4);
        croatiaSquad.setPlayer5(player5);
        croatiaSquad.setPlayer6(player6);
        croatiaSquad.setPlayer7(player7);
        croatiaSquad.setPlayer8(player8);
        croatiaSquad.setPlayer9(player9);
        croatiaSquad.setPlayer10(player10);
        croatiaSquad.setPlayer11(player11);
        croatiaSquad.setPlayer12(player12);
        croatiaSquad.setPlayer13(player13);
        croatiaSquad.setPlayer14(player14);
        croatiaSquad.setPlayer15(player15);
        croatiaSquad.setPlayer16(player16);
        croatiaSquad.setPlayer17(player17);
        croatiaSquad.setPlayer18(player18);
        croatiaSquad.setPlayer19(player19);
        croatiaSquad.setPlayer20(player20);
        croatiaSquad.setPlayer21(player21);
        croatiaSquad.setPlayer22(player22);
        croatiaSquad.setPlayer23(player23);
        croatiaSquad.setFlag(flag);
        
        squadList.add(croatiaSquad);
        
        count++;
    }
    
    public void greeceSquad(){
        teamName = "Greece";
        player1 = "Orestis Karnezis";
        player2 = "Michalis Sifakis";
        player3 = "Alexandros Tzorvas";
        player4 = "Loukas Vyntra";
        player5 = "Nikos Spyropoulos";
        player6 = "Kyriakos Papadopoulos";
        player7 = "Giannis Maniatis";
        player8 = "Sokratis Papastathopoulos";
        player9 = "Vassilis Torossidis";
        player10 = "Jose Holebas";
        player11 = "Kostas Manolas";
        player12 = "Sotiris Ninis";
        player13 = "Giannis Fetfatzidis";
        player14 = "Giorgos Karagounis";
        player15 = "Lazaros Christodoulopoulos";
        player16 = "Dimitris Siovas";
        player17 = "Kostas Fortounis";
        player18 = "Alexandros Tziolis";
        player19 = "Kostas Katsouranis";
        player20 = "Fanis Gekas";
        player21 = "Giorgios Samaras";
        player22 = "Dimitris Salpingidis";
        player23 = "Kostas Mitroglou";
        flag = "/teams/pictures/greFlag.gif";
        
        Squad greeceSquad = new Squad();
        greeceSquad.setTeamName(teamName);
        greeceSquad.setPlayer1(player1);
        greeceSquad.setPlayer2(player2);
        greeceSquad.setPlayer3(player3);
        greeceSquad.setPlayer4(player4);
        greeceSquad.setPlayer5(player5);
        greeceSquad.setPlayer6(player6);
        greeceSquad.setPlayer7(player7);
        greeceSquad.setPlayer8(player8);
        greeceSquad.setPlayer9(player9);
        greeceSquad.setPlayer10(player10);
        greeceSquad.setPlayer11(player11);
        greeceSquad.setPlayer12(player12);
        greeceSquad.setPlayer13(player13);
        greeceSquad.setPlayer14(player14);
        greeceSquad.setPlayer15(player15);
        greeceSquad.setPlayer16(player16);
        greeceSquad.setPlayer17(player17);
        greeceSquad.setPlayer18(player18);
        greeceSquad.setPlayer19(player19);
        greeceSquad.setPlayer20(player20);
        greeceSquad.setPlayer21(player21);
        greeceSquad.setPlayer22(player22);
        greeceSquad.setPlayer23(player23);
        greeceSquad.setFlag(flag);
        
        squadList.add(greeceSquad);
        
        count++;
    }
    
    public void italySquad(){
        teamName = "Italy";
        player1 = "Gianluigi Buffon";
        player2 = "Salvatore Sirigu";
        player3 = "Morgan De Sanctis";
        player4 = "Christian Maggio";
        player5 = "Ignazio Abate";
        player6 = "Andrea Barzagli";
        player7 = "Federico Balzaretti";
        player8 = "Andrea Ranocchia";
        player9 = "Giorgio Chiellini";
        player10 = "Leonardo Bonucci";
        player11 = "Davide Astori";
        player12 = "Riccardo Montolivo";
        player13 = "Antonio Candreva";
        player14 = "Thiago Motta";
        player15 = "Marco Verratti";
        player16 = "Claudio Marchisio";
        player17 = "Andrea Pirlo";
        player18 = "Daniele De Rossi";
        player19 = "Andrea Poli";
        player20 = "Stephan El Shaarawy";
        player21 = "Pablo Osvaldo";
        player22 = "Mario Balotelli";
        player23 = "Giuseppe Rossi";
        flag = "/teams/pictures/itaFlag.gif";
        
        Squad italySquad = new Squad();
        italySquad.setTeamName(teamName);
        italySquad.setPlayer1(player1);
        italySquad.setPlayer2(player2);
        italySquad.setPlayer3(player3);
        italySquad.setPlayer4(player4);
        italySquad.setPlayer5(player5);
        italySquad.setPlayer6(player6);
        italySquad.setPlayer7(player7);
        italySquad.setPlayer8(player8);
        italySquad.setPlayer9(player9);
        italySquad.setPlayer10(player10);
        italySquad.setPlayer11(player11);
        italySquad.setPlayer12(player12);
        italySquad.setPlayer13(player13);
        italySquad.setPlayer14(player14);
        italySquad.setPlayer15(player15);
        italySquad.setPlayer16(player16);
        italySquad.setPlayer17(player17);
        italySquad.setPlayer18(player18);
        italySquad.setPlayer19(player19);
        italySquad.setPlayer20(player20);
        italySquad.setPlayer21(player21);
        italySquad.setPlayer22(player22);
        italySquad.setPlayer23(player23);
        italySquad.setFlag(flag);
        
        squadList.add(italySquad);
        
        count++;
    }
    
    public void portugalSquad(){
        teamName = "Portugal";
        player1 = "Rui Patricio";
        player2 = "Beto";
        player3 = "Eduardo";
        player4 = "Joao Pereira";
        player5 = "Ricardo Costa";
        player6 = "Pepe";
        player7 = "Bruno Alves";
        player8 = "Miguel Lopes";
        player9 = "Antunes";
        player10 = "Luis Neto";
        player11 = "Fabio Coentrao";
        player12 = "Nani";
        player13 = "William Carvalho";
        player14 = "Raul Meireles";
        player15 = "Joao Moutinho";
        player16 = "Miguel Veloso";
        player17 = "Ruben Micael";
        player18 = "Josue";
        player19 = "Danny";
        player20 = "Helder Postiga";
        player21 = "Silvestre Varela";
        player22 = "Hugo Almeida";
        player23 = "Cristiano Ronaldo";
        flag = "/teams/pictures/porFlag.gif";
        
        Squad portugalSquad = new Squad();
        portugalSquad.setTeamName(teamName);
        portugalSquad.setPlayer1(player1);
        portugalSquad.setPlayer2(player2);
        portugalSquad.setPlayer3(player3);
        portugalSquad.setPlayer4(player4);
        portugalSquad.setPlayer5(player5);
        portugalSquad.setPlayer6(player6);
        portugalSquad.setPlayer7(player7);
        portugalSquad.setPlayer8(player8);
        portugalSquad.setPlayer9(player9);
        portugalSquad.setPlayer10(player10);
        portugalSquad.setPlayer11(player11);
        portugalSquad.setPlayer12(player12);
        portugalSquad.setPlayer13(player13);
        portugalSquad.setPlayer14(player14);
        portugalSquad.setPlayer15(player15);
        portugalSquad.setPlayer16(player16);
        portugalSquad.setPlayer17(player17);
        portugalSquad.setPlayer18(player18);
        portugalSquad.setPlayer19(player19);
        portugalSquad.setPlayer20(player20);
        portugalSquad.setPlayer21(player21);
        portugalSquad.setPlayer22(player22);
        portugalSquad.setPlayer23(player23);
        portugalSquad.setFlag(flag);
        
        squadList.add(portugalSquad);
        
        count++;
    }
    
    public void russiaSquad(){
        teamName = "Russia";
        player1 = "Igor Akinfeev";
        player2 = "Sergei Ryzhikov";
        player3 = "Yuri Lodygin";
        player4 = "Vasili Berezutski";
        player5 = "Georgi Schennikov";
        player6 = "Aleksandr Anyukov";
        player7 = "Sergei Ignashevich";
        player8 = "Andrei Eschenko";
        player9 = "Vladimir Granat";
        player10 = "Igor Smolnikov";
        player11 = "Aleksei Kozlov";
        player12 = "Denis Glushakov";
        player13 = "Igor Denisov";
        player14 = "Roman Shirokov";
        player15 = "Alan Dzagoev";
        player16 = "Dmitri Kombarov";
        player17 = "Viktor Fayzulin";
        player18 = "Aleksandr Samedov";
        player19 = "Vladimir Bystrov";
        player20 = "Aleksandr Kerzhakov";
        player21 = "Artem Dzyuba";
        player22 = "Aleksandr Kokorin";
        player23 = "Fedor Simolov";
        flag = "/teams/pictures/rusFlag.gif";
        
        Squad russiaSquad = new Squad();
        russiaSquad.setTeamName(teamName);
        russiaSquad.setPlayer1(player1);
        russiaSquad.setPlayer2(player2);
        russiaSquad.setPlayer3(player3);
        russiaSquad.setPlayer4(player4);
        russiaSquad.setPlayer5(player5);
        russiaSquad.setPlayer6(player6);
        russiaSquad.setPlayer7(player7);
        russiaSquad.setPlayer8(player8);
        russiaSquad.setPlayer9(player9);
        russiaSquad.setPlayer10(player10);
        russiaSquad.setPlayer11(player11);
        russiaSquad.setPlayer12(player12);
        russiaSquad.setPlayer13(player13);
        russiaSquad.setPlayer14(player14);
        russiaSquad.setPlayer15(player15);
        russiaSquad.setPlayer16(player16);
        russiaSquad.setPlayer17(player17);
        russiaSquad.setPlayer18(player18);
        russiaSquad.setPlayer19(player19);
        russiaSquad.setPlayer20(player20);
        russiaSquad.setPlayer21(player21);
        russiaSquad.setPlayer22(player22);
        russiaSquad.setPlayer23(player23);
        russiaSquad.setFlag(flag);
        
        squadList.add(russiaSquad);
        
        count++;
    }
    
    public void switzerlandSquad(){
        teamName = "Switzerland";
        player1 = "Diego Benaglio";
        player2 = "Yann Sommer";
        player3 = "Marco Wolfli";
        player4 = "Steve von Bergen";
        player5 = "Stephan Lichtsteiner";
        player6 = "Johan Djourou";
        player7 = "Reto Ziegler";
        player8 = "Fabian Schar";
        player9 = "Philippe Senderos";
        player10 = "Timm Klose";
        player11 = "Ricardo Rodriguez";
        player12 = "Valentin Stocker";
        player13 = "Valon Behrami";
        player14 = "Granit Xhaka";
        player15 = "Gokhan Inler";
        player16 = "Tranquillo Barnetta";
        player17 = "Blerim Dzemaili";
        player18 = "Xherdan Shaqiri";
        player19 = "Gelson Fernandes";
        player20 = "Haris Seferovic";
        player21 = "Admir Mehmedi";
        player22 = "Eren Derdiyok";
        player23 = "Mario Gavranovic";
        flag = "/teams/pictures/switzFlag.gif";
        
        Squad switzSquad = new Squad();
        switzSquad.setTeamName(teamName);
        switzSquad.setPlayer1(player1);
        switzSquad.setPlayer2(player2);
        switzSquad.setPlayer3(player3);
        switzSquad.setPlayer4(player4);
        switzSquad.setPlayer5(player5);
        switzSquad.setPlayer6(player6);
        switzSquad.setPlayer7(player7);
        switzSquad.setPlayer8(player8);
        switzSquad.setPlayer9(player9);
        switzSquad.setPlayer10(player10);
        switzSquad.setPlayer11(player11);
        switzSquad.setPlayer12(player12);
        switzSquad.setPlayer13(player13);
        switzSquad.setPlayer14(player14);
        switzSquad.setPlayer15(player15);
        switzSquad.setPlayer16(player16);
        switzSquad.setPlayer17(player17);
        switzSquad.setPlayer18(player18);
        switzSquad.setPlayer19(player19);
        switzSquad.setPlayer20(player20);
        switzSquad.setPlayer21(player21);
        switzSquad.setPlayer22(player22);
        switzSquad.setPlayer23(player23);
        switzSquad.setFlag(flag);
        
        squadList.add(switzSquad);
        
        count++;
    }
    
    public void brazilSquad(){
        teamName = "Brazil";
        player1 = "Julio Cesar";
        player2 = "Victor";
        player3 = "Dos Anjos Fernando Henrique";
        player4 = "Dani Alves";
        player5 = "Rafinha";
        player6 = "Thiago Silva";
        player7 = "Anderson Dede";
        player8 = "David Luiz";
        player9 = "Dante";
        player10 = "Filipe Luis";
        player11 = "Marcelo";
        player12 = "Lucas Moura";
        player13 = "Bernard";
        player14 = "Hernanes";
        player15 = "Ramires";
        player16 = "Paulinho";
        player17 = "Fernandinho";
        player18 = "Lucas Leiva";
        player19 = "Oscar";
        player20 = "Willain";
        player21 = "Fred";
        player22 = "Hulk";
        player23 = "Neymar";
        flag = "/teams/pictures/brazilFlag.gif";
        
        Squad brazilSquad = new Squad();
        brazilSquad.setTeamName(teamName);
        brazilSquad.setPlayer1(player1);
        brazilSquad.setPlayer2(player2);
        brazilSquad.setPlayer3(player3);
        brazilSquad.setPlayer4(player4);
        brazilSquad.setPlayer5(player5);
        brazilSquad.setPlayer6(player6);
        brazilSquad.setPlayer7(player7);
        brazilSquad.setPlayer8(player8);
        brazilSquad.setPlayer9(player9);
        brazilSquad.setPlayer10(player10);
        brazilSquad.setPlayer11(player11);
        brazilSquad.setPlayer12(player12);
        brazilSquad.setPlayer13(player13);
        brazilSquad.setPlayer14(player14);
        brazilSquad.setPlayer15(player15);
        brazilSquad.setPlayer16(player16);
        brazilSquad.setPlayer17(player17);
        brazilSquad.setPlayer18(player18);
        brazilSquad.setPlayer19(player19);
        brazilSquad.setPlayer20(player20);
        brazilSquad.setPlayer21(player21);
        brazilSquad.setPlayer22(player22);
        brazilSquad.setPlayer23(player23);
        brazilSquad.setFlag(flag);
        
        squadList.add(brazilSquad);
        
        count++;
    }
    
    public void argentinaSquad(){
        teamName = "Argentina";
        player1 = "Sergio Romero";
        player2 = "Mariano Andujar";
        player3 = "Agustin Orion";
        player4 = "Pablo Zabaleta";
        player5 = "Federico Fernandez";
        player6 = "Marcos Rojo";
        player7 = "Ezequiel Garay";
        player8 = "Nicolas Otamendi";
        player9 = "Hugo Campagnaro";
        player10 = "Lisandro Ezequiel Lopez";
        player11 = "Gino Peruzzi";
        player12 = "Angel Di Maria";
        player13 = "Jose Ernesto Sosa";
        player14 = "Ever Banega";
        player15 = "Fernando Gago";
        player16 = "Javier Mascherano";
        player17 = "Lucas Biglia";
        player18 = "Augusto Fernandez";
        player19 = "Ricardo Alvarez";
        player20 = "Gonzalo Higuain";
        player21 = "Ezequiel Lavezzi";
        player22 = "Sergio Aguero";
        player23 = "Lionel Messi";
        flag = "/teams/pictures/argFlag.gif";
        
        Squad argSquad = new Squad();
        argSquad.setTeamName(teamName);
        argSquad.setPlayer1(player1);
        argSquad.setPlayer2(player2);
        argSquad.setPlayer3(player3);
        argSquad.setPlayer4(player4);
        argSquad.setPlayer5(player5);
        argSquad.setPlayer6(player6);
        argSquad.setPlayer7(player7);
        argSquad.setPlayer8(player8);
        argSquad.setPlayer9(player9);
        argSquad.setPlayer10(player10);
        argSquad.setPlayer11(player11);
        argSquad.setPlayer12(player12);
        argSquad.setPlayer13(player13);
        argSquad.setPlayer14(player14);
        argSquad.setPlayer15(player15);
        argSquad.setPlayer16(player16);
        argSquad.setPlayer17(player17);
        argSquad.setPlayer18(player18);
        argSquad.setPlayer19(player19);
        argSquad.setPlayer20(player20);
        argSquad.setPlayer21(player21);
        argSquad.setPlayer22(player22);
        argSquad.setPlayer23(player23);
        argSquad.setFlag(flag);
        
        squadList.add(argSquad);
        
        count++;
    }
    
    public void chileSquad(){
        teamName = "Chile";
        player1 = "Johnny Herrera";
        player2 = "Cristopher Toselli";
        player3 = "Paulo Garces";
        player4 = "Gonzalo Jara";
        player5 = "Gary Medel";
        player6 = "Mauricio Isla";
        player7 = "Marcos Gonzalez";
        player8 = "Eugenio Mena";
        player9 = "Jose Rojas";
        player10 = "Osvaldo Gonzalez";
        player11 = "Jean Beausejour";
        player12 = "Matias Fernandez";
        player13 = "Jorge Valdivia";
        player14 = "Arturo Vidal";
        player15 = "Carlos Carmona";
        player16 = "Fabian Orellana";
        player17 = "Jose Pedro Fuenzalida";
        player18 = "Charles Aranguiz";
        player19 = "Felipe Gutierrez";
        player20 = "Francisco Silva";
        player21 = "Eduardo Vargas";
        player22 = "Mauricio Pinilla";
        player23 = "Alexis Sanchez";
        flag = "/teams/pictures/chileFlag.gif";
        
        Squad chiSquad = new Squad();
        chiSquad.setTeamName(teamName);
        chiSquad.setPlayer1(player1);
        chiSquad.setPlayer2(player2);
        chiSquad.setPlayer3(player3);
        chiSquad.setPlayer4(player4);
        chiSquad.setPlayer5(player5);
        chiSquad.setPlayer6(player6);
        chiSquad.setPlayer7(player7);
        chiSquad.setPlayer8(player8);
        chiSquad.setPlayer9(player9);
        chiSquad.setPlayer10(player10);
        chiSquad.setPlayer11(player11);
        chiSquad.setPlayer12(player12);
        chiSquad.setPlayer13(player13);
        chiSquad.setPlayer14(player14);
        chiSquad.setPlayer15(player15);
        chiSquad.setPlayer16(player16);
        chiSquad.setPlayer17(player17);
        chiSquad.setPlayer18(player18);
        chiSquad.setPlayer19(player19);
        chiSquad.setPlayer20(player20);
        chiSquad.setPlayer21(player21);
        chiSquad.setPlayer22(player22);
        chiSquad.setPlayer23(player23);
        chiSquad.setFlag(flag);
        
        squadList.add(chiSquad);
        
        count++;
    }
    
    public void colombiaSquad(){
        teamName = "Colombia";
        player1 = "Faryd Mondragon";
        player2 = "David Ospina";
        player3 = "Camilo Vargas";
        player4 = "Mario Yepes";
        player5 = "Luis Amaranto";
        player6 = "Pablo Armero";
        player7 = "Cristian Zapata";
        player8 = "Santiago Arias";
        player9 = "Stefan Medina";
        player10 = "Eder Alvarez Balanta";
        player11 = "Freddy Guarin";
        player12 = "Abel Aguilar";
        player13 = "Carlos Sanchez";
        player14 = "Macnelly Torres";
        player15 = "Aldo Leao Ramirez";
        player16 = "Juan Guillermo Cuadrado";
        player17 = "Alexander Mejia";
        player18 = "James Rodriguez";
        player19 = "Victor Ibarbo";
        player20 = "Jackson Martinez";
        player21 = "Teofilo Gutierrez";
        player22 = "Radamel Falcao";
        player23 = "Luis Muriel";
        flag = "/teams/pictures/colFlag.gif";
        
        Squad colSquad = new Squad();
        colSquad.setTeamName(teamName);
        colSquad.setPlayer1(player1);
        colSquad.setPlayer2(player2);
        colSquad.setPlayer3(player3);
        colSquad.setPlayer4(player4);
        colSquad.setPlayer5(player5);
        colSquad.setPlayer6(player6);
        colSquad.setPlayer7(player7);
        colSquad.setPlayer8(player8);
        colSquad.setPlayer9(player9);
        colSquad.setPlayer10(player10);
        colSquad.setPlayer11(player11);
        colSquad.setPlayer12(player12);
        colSquad.setPlayer13(player13);
        colSquad.setPlayer14(player14);
        colSquad.setPlayer15(player15);
        colSquad.setPlayer16(player16);
        colSquad.setPlayer17(player17);
        colSquad.setPlayer18(player18);
        colSquad.setPlayer19(player19);
        colSquad.setPlayer20(player20);
        colSquad.setPlayer21(player21);
        colSquad.setPlayer22(player22);
        colSquad.setPlayer23(player23);
        colSquad.setFlag(flag);
        
        squadList.add(colSquad);
        
        count++;
    }
    
    public void ecuadorSquad(){
        teamName = "Ecuador";
        player1 = "Maximo Banguera";
        player2 = "Adrian Bone";
        player3 = "Alexander Dominguez";
        player4 = "Jorge Guagua";
        player5 = "Frickson Erazo";
        player6 = "Juan Carlos Paredes";
        player7 = "Cristian Ramirez";
        player8 = "Oscar Bagui";
        player9 = "Gabriel Achilier";
        player10 = "Walter Ayovi";
        player11 = "Edison Mendez";
        player12 = "Segundo Castillo";
        player13 = "Antonia Valencia";
        player14 = "Luis Saritama";
        player15 = "Christian Noboa";
        player16 = "Jefferson Montero";
        player17 = "Enner Valencia";
        player18 = "Fidel Martinez";
        player19 = "Fernando Gaibor";
        player20 = "Felipe Caicedo";
        player21 = "Jaime Ayovi";
        player22 = "Narciso Mina";
        player23 = "Marlon de Jesus";
        flag = "/teams/pictures/ecuFlag.gif";
        
        Squad ecuSquad = new Squad();
        ecuSquad.setTeamName(teamName);
        ecuSquad.setPlayer1(player1);
        ecuSquad.setPlayer2(player2);
        ecuSquad.setPlayer3(player3);
        ecuSquad.setPlayer4(player4);
        ecuSquad.setPlayer5(player5);
        ecuSquad.setPlayer6(player6);
        ecuSquad.setPlayer7(player7);
        ecuSquad.setPlayer8(player8);
        ecuSquad.setPlayer9(player9);
        ecuSquad.setPlayer10(player10);
        ecuSquad.setPlayer11(player11);
        ecuSquad.setPlayer12(player12);
        ecuSquad.setPlayer13(player13);
        ecuSquad.setPlayer14(player14);
        ecuSquad.setPlayer15(player15);
        ecuSquad.setPlayer16(player16);
        ecuSquad.setPlayer17(player17);
        ecuSquad.setPlayer18(player18);
        ecuSquad.setPlayer19(player19);
        ecuSquad.setPlayer20(player20);
        ecuSquad.setPlayer21(player21);
        ecuSquad.setPlayer22(player22);
        ecuSquad.setPlayer23(player23);
        ecuSquad.setFlag(flag);
        
        squadList.add(ecuSquad);
        
        count++;
    }
    
    public void uruguaySquad(){
        teamName = "Uruguay";
        player1 = "Fernando Muslera";
        player2 = "Martin Silva";
        player3 = "Juan Castillo";
        player4 = "Diego Lugano";
        player5 = "Maxi Pereira";
        player6 = "Diego Godin";
        player7 = "Martin Caceres";
        player8 = "Jorge Fucile";
        player9 = "Jose Maria Gimenez";
        player10 = "Alejandre Silva";
        player11 = "Sebastian Coates";
        player12 = "Diego Perez";
        player13 = "Cristian Rodriguez";
        player14 = "Walter Gargano";
        player15 = "Alvaro Pereira";
        player16 = "Egidio Arevalo Rios";
        player17 = "Alvaro Gonzalez";
        player18 = "Gaston Ramirez";
        player19 = "Nicolas Lodeiro";
        player20 = "Diego Forlan";
        player21 = "Luis Suarez";
        player22 = "Abel Hernandez";
        player23 = "Edison Cavani";
        flag = "/teams/pictures/urgFlag.gif";
        
        Squad urgSquad = new Squad();
        urgSquad.setTeamName(teamName);
        urgSquad.setPlayer1(player1);
        urgSquad.setPlayer2(player2);
        urgSquad.setPlayer3(player3);
        urgSquad.setPlayer4(player4);
        urgSquad.setPlayer5(player5);
        urgSquad.setPlayer6(player6);
        urgSquad.setPlayer7(player7);
        urgSquad.setPlayer8(player8);
        urgSquad.setPlayer9(player9);
        urgSquad.setPlayer10(player10);
        urgSquad.setPlayer11(player11);
        urgSquad.setPlayer12(player12);
        urgSquad.setPlayer13(player13);
        urgSquad.setPlayer14(player14);
        urgSquad.setPlayer15(player15);
        urgSquad.setPlayer16(player16);
        urgSquad.setPlayer17(player17);
        urgSquad.setPlayer18(player18);
        urgSquad.setPlayer19(player19);
        urgSquad.setPlayer20(player20);
        urgSquad.setPlayer21(player21);
        urgSquad.setPlayer22(player22);
        urgSquad.setPlayer23(player23);
        urgSquad.setFlag(flag);
        
        squadList.add(urgSquad);
        
        count++;
    }
    
    public void costaRicaSquad(){
        teamName = "Costa-Rica";
        player1 = "Keylor Navas";
        player2 = "Patrick Pemberton";
        player3 = "Leonel Moreira";
        player4 = "Michael Umana";
        player5 = "Junior Diaz";
        player6 = "Roy Miller";
        player7 = "Giancarlo Gonzalez";
        player8 = "Jose Salvatierra";
        player9 = "Cristian Gamboa";
        player10 = "Oscar Duarte";
        player11 = "Waylon Francis";
        player12 = "Celso Borges";
        player13 = "Christian Bolanos";
        player14 = "Michael Barrantes";
        player15 = "Jose Miguel Cubero";
        player16 = "Yeltsin Tejeda";
        player17 = "Estebian Granados";
        player18 = "Diego Calvo";
        player19 = "Bryan Ruiz";
        player20 = "Alvaro Saborio";
        player21 = "Joel Campbell";
        player22 = "Marco Urena";
        player23 = "John Jairo Ruiz";
        flag = "/teams/pictures/cosRFlag.gif";
        
        Squad cosSquad = new Squad();
        cosSquad.setTeamName(teamName);
        cosSquad.setPlayer1(player1);
        cosSquad.setPlayer2(player2);
        cosSquad.setPlayer3(player3);
        cosSquad.setPlayer4(player4);
        cosSquad.setPlayer5(player5);
        cosSquad.setPlayer6(player6);
        cosSquad.setPlayer7(player7);
        cosSquad.setPlayer8(player8);
        cosSquad.setPlayer9(player9);
        cosSquad.setPlayer10(player10);
        cosSquad.setPlayer11(player11);
        cosSquad.setPlayer12(player12);
        cosSquad.setPlayer13(player13);
        cosSquad.setPlayer14(player14);
        cosSquad.setPlayer15(player15);
        cosSquad.setPlayer16(player16);
        cosSquad.setPlayer17(player17);
        cosSquad.setPlayer18(player18);
        cosSquad.setPlayer19(player19);
        cosSquad.setPlayer20(player20);
        cosSquad.setPlayer21(player21);
        cosSquad.setPlayer22(player22);
        cosSquad.setPlayer23(player23);
        cosSquad.setFlag(flag);
        
        squadList.add(cosSquad);
        
        count++;
    }
    
    public void hondurasSquad(){
        teamName = "Honduras";
        player1 = "Noel Valladares";
        player2 = "Donis Escober";
        player3 = "Luis Lopez";
        player4 = "Maynor Figueroa";
        player5 = "Victor Bernardez";
        player6 = "Emilio Izaguirre";
        player7 = "Juan Carlos Garcia";
        player8 = "Arnold Peralta";
        player9 = "Walter Williams";
        player10 = "Henry Clark";
        player11 = "Osman Chavez";
        player12 = "Oscar Garcia";
        player13 = "Jorge Claros";
        player14 = "Marvin Chavez";
        player15 = "Mario Martinez";
        player16 = "Edder Delgado";
        player17 = "Luis Garrido";
        player18 = "Andy Najar";
        player19 = "Bryan Acosta";
        player20 = "Jerry Bengston";
        player21 = "Ronny Martinez";
        player22 = "Carlos Costly";
        player23 = "Romell Quioto";
        flag = "/teams/pictures/honFlag.gif";
        
        Squad honSquad = new Squad();
        honSquad.setTeamName(teamName);
        honSquad.setPlayer1(player1);
        honSquad.setPlayer2(player2);
        honSquad.setPlayer3(player3);
        honSquad.setPlayer4(player4);
        honSquad.setPlayer5(player5);
        honSquad.setPlayer6(player6);
        honSquad.setPlayer7(player7);
        honSquad.setPlayer8(player8);
        honSquad.setPlayer9(player9);
        honSquad.setPlayer10(player10);
        honSquad.setPlayer11(player11);
        honSquad.setPlayer12(player12);
        honSquad.setPlayer13(player13);
        honSquad.setPlayer14(player14);
        honSquad.setPlayer15(player15);
        honSquad.setPlayer16(player16);
        honSquad.setPlayer17(player17);
        honSquad.setPlayer18(player18);
        honSquad.setPlayer19(player19);
        honSquad.setPlayer20(player20);
        honSquad.setPlayer21(player21);
        honSquad.setPlayer22(player22);
        honSquad.setPlayer23(player23);
        honSquad.setFlag(flag);
        
        squadList.add(honSquad);
        
        count++;
    }
    
    public void mexicoSquad(){
        teamName = "Mexico";
        player1 = "Moises Munoz";
        player2 = "Alfredo Talavera";
        player3 = "Guillermo Ochoa";
        player4 = "Rafael Marquez";
        player5 = "Francisco Javier Rodriquez";
        player6 = "Paul Aguilar";
        player7 = "Juan Carlos Valenzuela";
        player8 = "Miguel Layun";
        player9 = "Miguel Ponce";
        player10 = "Enrique Perez";
        player11 = "Rogello Chavez";
        player12 = "Jesus Zavala";
        player13 = "Carlos Pena";
        player14 = "Marco Fabian";
        player15 = "Luis Montes";
        player16 = "Juan Carlos Medina";
        player17 = "Isaac Brizuela";
        player18 = "Jose Juan Vazquez";
        player19 = "Hector Herrera";
        player20 = "Javier Hernandez";
        player21 = "Giovani dos Santos";
        player22 = "Raul Jimenez";
        player23 = "Alan Pulido";
        flag = "/teams/pictures/mexFlag.gif";
        
        Squad mexSquad = new Squad();
        mexSquad.setTeamName(teamName);
        mexSquad.setPlayer1(player1);
        mexSquad.setPlayer2(player2);
        mexSquad.setPlayer3(player3);
        mexSquad.setPlayer4(player4);
        mexSquad.setPlayer5(player5);
        mexSquad.setPlayer6(player6);
        mexSquad.setPlayer7(player7);
        mexSquad.setPlayer8(player8);
        mexSquad.setPlayer9(player9);
        mexSquad.setPlayer10(player10);
        mexSquad.setPlayer11(player11);
        mexSquad.setPlayer12(player12);
        mexSquad.setPlayer13(player13);
        mexSquad.setPlayer14(player14);
        mexSquad.setPlayer15(player15);
        mexSquad.setPlayer16(player16);
        mexSquad.setPlayer17(player17);
        mexSquad.setPlayer18(player18);
        mexSquad.setPlayer19(player19);
        mexSquad.setPlayer20(player20);
        mexSquad.setPlayer21(player21);
        mexSquad.setPlayer22(player22);
        mexSquad.setPlayer23(player23);
        mexSquad.setFlag(flag);
        
        squadList.add(mexSquad);
        
        count++;
    }
    
    public void usaSquad(){
        teamName = "USA";
        player1 = "Tim Howard";
        player2 = "Brad Guzan";
        player3 = "Nick Rimando";
        player4 = "Geoff Cameron";
        player5 = "Brad Evans";
        player6 = "Matt Besler";
        player7 = "Omar Gonzalez";
        player8 = "Clarence Goodson";
        player9 = "Michael Orozco";
        player10 = "Fabian Johnson";
        player11 = "DaMarcus Beasley";
        player12 = "Graham Zusi";
        player13 = "Alejandro Bedoya";
        player14 = "Michael Bradley";
        player15 = "Jermaine Jones";
        player16 = "Kyle Beckerman";
        player17 = "Clint Dempsey";
        player18 = "Landon Donovan";
        player19 = "Eddie Johnson";
        player20 = "Jozy Altidore";
        player21 = "Aron Johannsson";
        player22 = "Terrence Boyd";
        player23 = "Herculez Gomez";
        flag = "/teams/pictures/usaFlag.gif";
        
        Squad uSquad = new Squad();
        uSquad.setTeamName(teamName);
        uSquad.setPlayer1(player1);
        uSquad.setPlayer2(player2);
        uSquad.setPlayer3(player3);
        uSquad.setPlayer4(player4);
        uSquad.setPlayer5(player5);
        uSquad.setPlayer6(player6);
        uSquad.setPlayer7(player7);
        uSquad.setPlayer8(player8);
        uSquad.setPlayer9(player9);
        uSquad.setPlayer10(player10);
        uSquad.setPlayer11(player11);
        uSquad.setPlayer12(player12);
        uSquad.setPlayer13(player13);
        uSquad.setPlayer14(player14);
        uSquad.setPlayer15(player15);
        uSquad.setPlayer16(player16);
        uSquad.setPlayer17(player17);
        uSquad.setPlayer18(player18);
        uSquad.setPlayer19(player19);
        uSquad.setPlayer20(player20);
        uSquad.setPlayer21(player21);
        uSquad.setPlayer22(player22);
        uSquad.setPlayer23(player23);
        uSquad.setFlag(flag);
        
        squadList.add(uSquad);
        
        count++;
    }
    
    public void algeriaSquad(){
        teamName = "Algeria";
        player1 = "Mohamed Zemmamouche";
        player2 = "Azzedine Doukha";
        player3 = "Rais M'Bolhi";
        player4 = "Madjid Bougherra";
        player5 = "Rafik Halliche";
        player6 = "Djamel Mesbah";
        player7 = "Essaid Belkalem";
        player8 = "Liassine Cadamuro-Bentaiba";
        player9 = "Faouzi Ghoulam";
        player10 = "Aissa Mandi";
        player11 = "Ali Rial";
        player12 = "Medhi Lacen";
        player13 = "Adlene Guedioura";
        player14 = "Hassan Yebda";
        player15 = "Foued Kadir";
        player16 = "Sofiane Feghouli";
        player17 = "Saphir Taider";
        player18 = "Abdelmoumene Djabou";
        player19 = "Yacine Brahimi";
        player20 = "Rafik Djebbour";
        player21 = "El Arbi Hillel Soudani";
        player22 = "Islam Slimani";
        player23 = "Nabil Ghilas";
        flag = "/teams/pictures/algFlag.gif";
        
        Squad algSquad = new Squad();
        algSquad.setTeamName(teamName);
        algSquad.setPlayer1(player1);
        algSquad.setPlayer2(player2);
        algSquad.setPlayer3(player3);
        algSquad.setPlayer4(player4);
        algSquad.setPlayer5(player5);
        algSquad.setPlayer6(player6);
        algSquad.setPlayer7(player7);
        algSquad.setPlayer8(player8);
        algSquad.setPlayer9(player9);
        algSquad.setPlayer10(player10);
        algSquad.setPlayer11(player11);
        algSquad.setPlayer12(player12);
        algSquad.setPlayer13(player13);
        algSquad.setPlayer14(player14);
        algSquad.setPlayer15(player15);
        algSquad.setPlayer16(player16);
        algSquad.setPlayer17(player17);
        algSquad.setPlayer18(player18);
        algSquad.setPlayer19(player19);
        algSquad.setPlayer20(player20);
        algSquad.setPlayer21(player21);
        algSquad.setPlayer22(player22);
        algSquad.setPlayer23(player23);
        algSquad.setFlag(flag);
        
        squadList.add(algSquad);
        
        count++;
    }
    
    public void cameroonSquad(){
        teamName = "Cameroon";
        player1 = "Guy N'dy Assembe";
        player2 = "Charles Itandje";
        player3 = "Sammy N'Djock";
        player4 = "Nicolas N'Koulou";
        player5 = "Aurelien Chedjou";
        player6 = "Henri Bedimo";
        player7 = "Benoit Assou-Ekotto";
        player8 = "Dany Nounkeu";
        player9 = "Gaetan Bong";
        player10 = "Allan Nyom";
        player11 = "Jean-Armel Kana-Biyik";
        player12 = "Jean Makoun";
        player13 = "Alex Song";
        player14 = "Landry N'Guemo";
        player15 = "Eyong Enoh";
        player16 = "Joel Matip";
        player17 = "Stephane Mbia";
        player18 = "Edgar Salli";
        player19 = "Fabrice Olinga";
        player20 = "Samuel Eto'o";
        player21 = "Vincent Aboubakar";
        player22 = "Benjamin Moukandjo";
        player23 = "Maxim Choupo-Moting";
        flag = "/teams/pictures/camFlag.gif";
        
        Squad camSquad = new Squad();
        camSquad.setTeamName(teamName);
        camSquad.setPlayer1(player1);
        camSquad.setPlayer2(player2);
        camSquad.setPlayer3(player3);
        camSquad.setPlayer4(player4);
        camSquad.setPlayer5(player5);
        camSquad.setPlayer6(player6);
        camSquad.setPlayer7(player7);
        camSquad.setPlayer8(player8);
        camSquad.setPlayer9(player9);
        camSquad.setPlayer10(player10);
        camSquad.setPlayer11(player11);
        camSquad.setPlayer12(player12);
        camSquad.setPlayer13(player13);
        camSquad.setPlayer14(player14);
        camSquad.setPlayer15(player15);
        camSquad.setPlayer16(player16);
        camSquad.setPlayer17(player17);
        camSquad.setPlayer18(player18);
        camSquad.setPlayer19(player19);
        camSquad.setPlayer20(player20);
        camSquad.setPlayer21(player21);
        camSquad.setPlayer22(player22);
        camSquad.setPlayer23(player23);
        camSquad.setFlag(flag);
        
        squadList.add(camSquad);
        
        count++;
    }
    
    public void ghanaSquad(){
        teamName = "Ghana";
        player1 = "Adam Kwarasey";
        player2 = "Steve Adams";
        player3 = "Fatau Dauda";
        player4 = "Samuel Inkoom";
        player5 = "Harrison Afful";
        player6 = "John Boye";
        player7 = "Jonathon Mensah";
        player8 = "Daniel Opare";
        player9 = "Jerry Akaminko";
        player10 = "David Addy";
        player11 = "Baba Rahman";
        player12 = "Sulley Muntari";
        player13 = "Kwadwo Asamoah";
        player14 = "Michael Essien";
        player15 = "Emmanuel Agyemang-Badu";
        player16 = "Andre Ayew";
        player17 = "Christian Atsu";
        player18 = "Kevin-Prince-Boateng";
        player19 = "Wakaso Mubarak";
        player20 = "Asamoah Gyan";
        player21 = "Majeed Waris";
        player22 = "Jordan Ayew";
        player23 = "Frank Acheampong";
        flag = "/teams/pictures/ghaFlag.gif";
        
        Squad ghaSquad = new Squad();
        ghaSquad.setTeamName(teamName);
        ghaSquad.setPlayer1(player1);
        ghaSquad.setPlayer2(player2);
        ghaSquad.setPlayer3(player3);
        ghaSquad.setPlayer4(player4);
        ghaSquad.setPlayer5(player5);
        ghaSquad.setPlayer6(player6);
        ghaSquad.setPlayer7(player7);
        ghaSquad.setPlayer8(player8);
        ghaSquad.setPlayer9(player9);
        ghaSquad.setPlayer10(player10);
        ghaSquad.setPlayer11(player11);
        ghaSquad.setPlayer12(player12);
        ghaSquad.setPlayer13(player13);
        ghaSquad.setPlayer14(player14);
        ghaSquad.setPlayer15(player15);
        ghaSquad.setPlayer16(player16);
        ghaSquad.setPlayer17(player17);
        ghaSquad.setPlayer18(player18);
        ghaSquad.setPlayer19(player19);
        ghaSquad.setPlayer20(player20);
        ghaSquad.setPlayer21(player21);
        ghaSquad.setPlayer22(player22);
        ghaSquad.setPlayer23(player23);
        ghaSquad.setFlag(flag);
        
        squadList.add(ghaSquad);
        
        count++;
    }
    
    public void ivoryCoastSquad(){
        teamName = "Ivory Coast";
        player1 = "Boubacar Barry";
        player2 = "Sayouba Mande";
        player3 = "Sylvain Gbohouo";
        player4 = "Didier Zokora";
        player5 = "Kolo Toure";
        player6 = "Siaka Tiene";
        player7 = "Arthur Boka";
        player8 = "Segie Aurier";
        player9 = "Brice Dja Djedje";
        player10 = "Constant Djakpa";
        player11 = "Ousmane Viera";
        player12 = "Yaya Toure";
        player13 = "Romaric";
        player14 = "Cheick Tiote";
        player15 = "Max Gradel";
        player16 = "Jean-Jacques Gosso";
        player17 = "Jean Seri";
        player18 = "Ismael Diomande";
        player19 = "Salomon Kalou";
        player20 = "Didier Drogba";
        player21 = "Wilfried Bony";
        player22 = "Seydou Doumbia";
        player23 = "Gervinho";
        flag = "/teams/pictures/ivoryCFlag.gif";
        
        Squad ivSquad = new Squad();
        ivSquad.setTeamName(teamName);
        ivSquad.setPlayer1(player1);
        ivSquad.setPlayer2(player2);
        ivSquad.setPlayer3(player3);
        ivSquad.setPlayer4(player4);
        ivSquad.setPlayer5(player5);
        ivSquad.setPlayer6(player6);
        ivSquad.setPlayer7(player7);
        ivSquad.setPlayer8(player8);
        ivSquad.setPlayer9(player9);
        ivSquad.setPlayer10(player10);
        ivSquad.setPlayer11(player11);
        ivSquad.setPlayer12(player12);
        ivSquad.setPlayer13(player13);
        ivSquad.setPlayer14(player14);
        ivSquad.setPlayer15(player15);
        ivSquad.setPlayer16(player16);
        ivSquad.setPlayer17(player17);
        ivSquad.setPlayer18(player18);
        ivSquad.setPlayer19(player19);
        ivSquad.setPlayer20(player20);
        ivSquad.setPlayer21(player21);
        ivSquad.setPlayer22(player22);
        ivSquad.setPlayer23(player23);
        ivSquad.setFlag(flag);
        
        squadList.add(ivSquad);
        
        count++;
    }
    
    public void nigeriaSquad(){
        teamName = "Nigeria";
        player1 = "Vincent Enyeama";
        player2 = "Austin Ejide";
        player3 = "Chigozie Agbim";
        player4 = "Elderson";
        player5 = "Efe Ambrose";
        player6 = "Godfrey Oboabona";
        player7 = "Azubuike Egwuekwe";
        player8 = "Kenneth Omeruo";
        player9 = "Joseph Yobo";
        player10 = "Kunie Odunlami";
        player11 = "Leon Balogun";
        player12 = "John Obi Mikel";
        player13 = "Ahmed Musa";
        player14 = "Ejike Uzoenyi";
        player15 = "Ogenyi Onazi";
        player16 = "Victor Moses";
        player17 = "Shehu Abdullahi";
        player18 = "Ramon Azeez";
        player19 = "Nosa Igiebor";
        player20 = "Victor Obinna";
        player21 = "Emmanuel Emenike";
        player22 = "Imoh Ezekiel";
        player23 = "Michael Uchebo";
        flag = "/teams/pictures/nigFlag.gif";
        
        Squad nigSquad = new Squad();
        nigSquad.setTeamName(teamName);
        nigSquad.setPlayer1(player1);
        nigSquad.setPlayer2(player2);
        nigSquad.setPlayer3(player3);
        nigSquad.setPlayer4(player4);
        nigSquad.setPlayer5(player5);
        nigSquad.setPlayer6(player6);
        nigSquad.setPlayer7(player7);
        nigSquad.setPlayer8(player8);
        nigSquad.setPlayer9(player9);
        nigSquad.setPlayer10(player10);
        nigSquad.setPlayer11(player11);
        nigSquad.setPlayer12(player12);
        nigSquad.setPlayer13(player13);
        nigSquad.setPlayer14(player14);
        nigSquad.setPlayer15(player15);
        nigSquad.setPlayer16(player16);
        nigSquad.setPlayer17(player17);
        nigSquad.setPlayer18(player18);
        nigSquad.setPlayer19(player19);
        nigSquad.setPlayer20(player20);
        nigSquad.setPlayer21(player21);
        nigSquad.setPlayer22(player22);
        nigSquad.setPlayer23(player23);
        nigSquad.setFlag(flag);
        
        squadList.add(nigSquad);
        
        count++;
    }
    
    public void koreaSquad(){
        teamName = "South Korea";
        player1 = "Jung Sung-Ryong";
        player2 = "Kim Seung-Gyu";
        player3 = "Kim Jin-Hyeon";
        player4 = "Hong Jeong-Ho";
        player5 = "Kim Young-Gwon";
        player6 = "Park Joo-Ho";
        player7 = "Lee Yong";
        player8 = "Kim Jin-Su";
        player9 = "Hwang Seok-Ho";
        player10 = "Kim Ju-Young";
        player11 = "Kim Kee-Hee";
        player12 = "Ki Sung-Yueng";
        player13 = "Lee Chung-Yong";
        player14 = "Koo Ja-Cheol";
        player15 = "Kim Bo-Kyung";
        player16 = "Ha Dae-Sung";
        player17 = "Park Jong-Woo";
        player18 = "Han Kook-Young";
        player19 = "Ji-Sung Park";
        player20 = "Park Chu-Young";
        player21 = "Ji Dong-Won";
        player22 = "Son Heung-Min";
        player23 = "Lee Keun-Ho";
        flag = "/teams/pictures/koreaFlag.gif";
        
        Squad korSquad = new Squad();
        korSquad.setTeamName(teamName);
        korSquad.setPlayer1(player1);
        korSquad.setPlayer2(player2);
        korSquad.setPlayer3(player3);
        korSquad.setPlayer4(player4);
        korSquad.setPlayer5(player5);
        korSquad.setPlayer6(player6);
        korSquad.setPlayer7(player7);
        korSquad.setPlayer8(player8);
        korSquad.setPlayer9(player9);
        korSquad.setPlayer10(player10);
        korSquad.setPlayer11(player11);
        korSquad.setPlayer12(player12);
        korSquad.setPlayer13(player13);
        korSquad.setPlayer14(player14);
        korSquad.setPlayer15(player15);
        korSquad.setPlayer16(player16);
        korSquad.setPlayer17(player17);
        korSquad.setPlayer18(player18);
        korSquad.setPlayer19(player19);
        korSquad.setPlayer20(player20);
        korSquad.setPlayer21(player21);
        korSquad.setPlayer22(player22);
        korSquad.setPlayer23(player23);
        korSquad.setFlag(flag);
        
        squadList.add(korSquad);
        
        count++;
    }
    
    public void japanSquad(){
        teamName = "Japan";
        player1 = "Eiji Kawashima";
        player2 = "Shusaku Nishikawa";
        player3 = "Schuichi Gonda";
        player4 = "Yuichi Komano";
        player5 = "Yasuyuki Konno";
        player6 = "Yugo Nagatomo";
        player7 = "Maya Yoshida";
        player8 = "Masahiko Inoha";
        player9 = "Hiroki Sakai";
        player10 = "Gotoku Sakai";
        player11 = "Masato Morishige";
        player12 = "Yasuhito Endo";
        player13 = "Shinji Kagawa";
        player14 = "Keisuke Honda";
        player15 = "Hajime Hosogai";
        player16 = "Hiroshi Kiyotake";
        player17 = "Hotaru Yamaguchi";
        player18 = "Manabu Saito";
        player19 = "Toshihiro Aoyama";
        player20 = "Shinji Okazaki";
        player21 = "Yuya Osako";
        player22 = "Masato Kudo";
        player23 = "Yohei Toyoda";
        flag = "/teams/pictures/japFlag.gif";
        
        Squad japSquad = new Squad();
        japSquad.setTeamName(teamName);
        japSquad.setPlayer1(player1);
        japSquad.setPlayer2(player2);
        japSquad.setPlayer3(player3);
        japSquad.setPlayer4(player4);
        japSquad.setPlayer5(player5);
        japSquad.setPlayer6(player6);
        japSquad.setPlayer7(player7);
        japSquad.setPlayer8(player8);
        japSquad.setPlayer9(player9);
        japSquad.setPlayer10(player10);
        japSquad.setPlayer11(player11);
        japSquad.setPlayer12(player12);
        japSquad.setPlayer13(player13);
        japSquad.setPlayer14(player14);
        japSquad.setPlayer15(player15);
        japSquad.setPlayer16(player16);
        japSquad.setPlayer17(player17);
        japSquad.setPlayer18(player18);
        japSquad.setPlayer19(player19);
        japSquad.setPlayer20(player20);
        japSquad.setPlayer21(player21);
        japSquad.setPlayer22(player22);
        japSquad.setPlayer23(player23);
        japSquad.setFlag(flag);
        
        squadList.add(japSquad);
        
        count++;
    }
    
    public void australiaSquad(){
        teamName = "Australia";
        player1 = "Mathew Ryan";
        player2 = "Brad Jones";
        player3 = "Mitchell Langerak";
        player4 = "Luke Wilkshire";
        player5 = "Matthew Spiranovic";
        player6 = "Ryan McGowan";
        player7 = "Ivan Franjic";
        player8 = "Jason Davison";
        player9 = "Curtis Good";
        player10 = "Alex Wilkinson";
        player11 = "Rhys Williams";
        player12 = "Mile Jedinak";
        player13 = "Mark Milligan";
        player14 = "Tommy Oar";
        player15 = "Tom Rogic";
        player16 = "Adam Sarota";
        player17 = "Oliver Bozanic";
        player18 = "Massimo Luongo";
        player19 = "James Holland";
        player20 = "Tim Cahill";
        player21 = "Mathew Leckie";
        player22 = "Robbie Kruse";
        player23 = "Connor Pain";
        flag = "/teams/pictures/ausFlag.gif";
        
        Squad ausSquad = new Squad();
        ausSquad.setTeamName(teamName);
        ausSquad.setPlayer1(player1);
        ausSquad.setPlayer2(player2);
        ausSquad.setPlayer3(player3);
        ausSquad.setPlayer4(player4);
        ausSquad.setPlayer5(player5);
        ausSquad.setPlayer6(player6);
        ausSquad.setPlayer7(player7);
        ausSquad.setPlayer8(player8);
        ausSquad.setPlayer9(player9);
        ausSquad.setPlayer10(player10);
        ausSquad.setPlayer11(player11);
        ausSquad.setPlayer12(player12);
        ausSquad.setPlayer13(player13);
        ausSquad.setPlayer14(player14);
        ausSquad.setPlayer15(player15);
        ausSquad.setPlayer16(player16);
        ausSquad.setPlayer17(player17);
        ausSquad.setPlayer18(player18);
        ausSquad.setPlayer19(player19);
        ausSquad.setPlayer20(player20);
        ausSquad.setPlayer21(player21);
        ausSquad.setPlayer22(player22);
        ausSquad.setPlayer23(player23);
        ausSquad.setFlag(flag);
        
        squadList.add(ausSquad);
        
        count++;
    }
    
    public void iranSquad(){
        teamName = "Iran";
        player1 = "Alireza Haghighi";
        player2 = "Daniel Davari";
        player3 = "Sosha Makani";
        player4 = "Jalal Hosseini";
        player5 = "Ehsan Hajsafi";
        player6 = "Khosro Heydari";
        player7 = "Pejman Montazeri";
        player8 = "Mehrdad Pooladi";
        player9 = "Amir Hossein Sadeghi";
        player10 = "Mohammad Reza Khanzadeh";
        player11 = "Steven Beitashour";
        player12 = "Javad Nekounam";
        player13 = "Masoud Shojaei";
        player14 = "Mojtaba Jabbari";
        player15 = "Ghasem Haddadifar";
        player16 = "Ashkan Dejagah";
        player17 = "Yaghoub Karimi";
        player18 = "Reza Haghighi";
        player19 = "Alireza Jahanbakhsh";
        player20 = "Mohammad Reza Khalatbari";
        player21 = "Karim Ansarifard";
        player22 = "Reza Ghoochannejhad";
        player23 = "Gholamreza Rezaei";
        flag = "/teams/pictures/iranFlag.gif";
        
        Squad irSquad = new Squad();
        irSquad.setTeamName(teamName);
        irSquad.setPlayer1(player1);
        irSquad.setPlayer2(player2);
        irSquad.setPlayer3(player3);
        irSquad.setPlayer4(player4);
        irSquad.setPlayer5(player5);
        irSquad.setPlayer6(player6);
        irSquad.setPlayer7(player7);
        irSquad.setPlayer8(player8);
        irSquad.setPlayer9(player9);
        irSquad.setPlayer10(player10);
        irSquad.setPlayer11(player11);
        irSquad.setPlayer12(player12);
        irSquad.setPlayer13(player13);
        irSquad.setPlayer14(player14);
        irSquad.setPlayer15(player15);
        irSquad.setPlayer16(player16);
        irSquad.setPlayer17(player17);
        irSquad.setPlayer18(player18);
        irSquad.setPlayer19(player19);
        irSquad.setPlayer20(player20);
        irSquad.setPlayer21(player21);
        irSquad.setPlayer22(player22);
        irSquad.setPlayer23(player23);
        irSquad.setFlag(flag);
        
        squadList.add(irSquad);
        
        count++;
    }

    //methods that will add each countrys amanager, captain and star player information to the array of objects 
    public void england(){
        TeamInformation eng = new TeamInformation();
        
        managerPic = "/teams/pictures/RH.png";
        managerName = "Roy Hodgson";
        managerAge = 66;
        managerNation = "English";
        captainPic = "/teams/pictures/Steven Gerrard.fw.png";
        captainName = "Steven Gerrard";
        captainAge = 33;
        captainClub = "Liverpool";
        starPic = "/teams/pictures/WR.png";
        starName = "Wayne Rooney";
        starAge = 28;
        starClub = "Manchester United";
        
        
        eng.setManagerPic(managerPic);
        eng.setManagerName(managerName);
        eng.setManagerAge(managerAge);
        eng.setManagerNation(managerNation);
        eng.setCaptainPic(captainPic);
        eng.setCaptainName(captainName);
        eng.setCaptainAge(captainAge);
        eng.setCaptainClub(captainClub);
        eng.setStarPic(starPic);
        eng.setStarName(starName);
        eng.setStarAge(starAge);
        eng.setStarClub(starClub);
        
        //adding object to the array
        info[0] = eng;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[0].getManagerPic())));
        managerNameLbl.setText(info[0].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[0].getManagerAge()));
        managerNatLbl.setText(info[0].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[0].getCaptainPic())));
        captainNameLbl.setText(info[0].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[0].getCaptainAge()));
        captainClubLbl.setText(info[0].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[0].getStarPic())));
        starNameLbl.setText(info[0].getStarName());
        starAgeLbl.setText(Integer.toString(info[0].getStarAge()));
        starClubLbl.setText(info[0].getStarClub());
        }
    }
    
    public void spain(){
        TeamInformation esp = new TeamInformation();
        
        managerPic = "/teams/pictures/VDB.fw.png";
        managerName = "Vicente del Bosque";
        managerAge = 63;
        managerNation = "Spanish";
        captainPic = "/teams/pictures/IC.fw.png";
        captainName = "Iker Casillas";
        captainAge = 32;
        captainClub = "Real Madrid";
        starPic = "/teams/pictures/Iniesta.fw.png";
        starName = "Andres Iniesta";
        starAge = 29;
        starClub = "Barcelona";
        
        esp.setManagerPic(managerPic);
        esp.setManagerName(managerName);
        esp.setManagerAge(managerAge);
        esp.setManagerNation(managerNation);
        esp.setCaptainPic(captainPic);
        esp.setCaptainName(captainName);
        esp.setCaptainAge(captainAge);
        esp.setCaptainClub(captainClub);
        esp.setStarPic(starPic);
        esp.setStarName(starName);
        esp.setStarAge(starAge);
        esp.setStarClub(starClub);
        
        //adding object to the array
        info[1] = esp;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[1].getManagerPic())));
        managerNameLbl.setText(info[1].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[1].getManagerAge()));
        managerNatLbl.setText(info[1].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[1].getCaptainPic())));
        captainNameLbl.setText(info[1].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[1].getCaptainAge()));
        captainClubLbl.setText(info[1].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[1].getStarPic())));
        starNameLbl.setText(info[1].getStarName());
        starAgeLbl.setText(Integer.toString(info[1].getStarAge()));
        starClubLbl.setText(info[1].getStarClub());
        }
    }
    
    public void brazil(){
        TeamInformation bra = new TeamInformation();
        
        managerPic = "/teams/pictures/LFS.png";
        managerName = "Luiz Felipe Scolari";
        managerAge = 65;
        managerNation = "Brazilian"; 
        captainPic = "/teams/pictures/TS.png";
        captainName = "Thiago Silva";
        captainAge = 29;
        captainClub = "Paris Saint Germain";
        starPic = "/teams/pictures/Neymar.fw.png";
        starName = "Neymar";
        starAge = 22;
        starClub = "Barcelona";
        
        bra.setManagerPic(managerPic);
        bra.setManagerName(managerName);
        bra.setManagerAge(managerAge);
        bra.setManagerNation(managerNation);
        bra.setCaptainPic(captainPic);
        bra.setCaptainName(captainName);
        bra.setCaptainAge(captainAge);
        bra.setCaptainClub(captainClub);
        bra.setStarPic(starPic);
        bra.setStarName(starName);
        bra.setStarAge(starAge);
        bra.setStarClub(starClub);
        
        //adding object to the array
        info[2] = bra;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[2].getManagerPic())));
        managerNameLbl.setText(info[2].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[2].getManagerAge()));
        managerNatLbl.setText(info[2].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[2].getCaptainPic())));
        captainNameLbl.setText(info[2].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[2].getCaptainAge()));
        captainClubLbl.setText(info[2].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[2].getStarPic())));
        starNameLbl.setText(info[2].getStarName());
        starAgeLbl.setText(Integer.toString(info[2].getStarAge()));
        starClubLbl.setText(info[2].getStarClub());
        }
    }
    
    public void holland(){
        TeamInformation hol = new TeamInformation();
        
        managerPic = "/teams/pictures/LVG.fw.png";
        managerName = "Louis van Gaal";
        managerAge = 62;
        managerNation = "Dutch";
        captainPic = "/teams/pictures/RVP.fw.png";
        captainName = "Robin van Persie";
        captainAge = 30;
        captainClub = "Manchester United";
        starPic = "/teams/pictures/Robben.fw.png";
        starName = "Arjen Robben";
        starAge = 30;
        starClub = "Bayern Munich";
        
        hol.setManagerPic(managerPic);
        hol.setManagerName(managerName);
        hol.setManagerAge(managerAge);
        hol.setManagerNation(managerNation);
        hol.setCaptainPic(captainPic);
        hol.setCaptainName(captainName);
        hol.setCaptainAge(captainAge);
        hol.setCaptainClub(captainClub);
        hol.setStarPic(starPic);
        hol.setStarName(starName);
        hol.setStarAge(starAge);
        hol.setStarClub(starClub);
        
        //adding object to the array
        info[3] = hol;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[3].getManagerPic())));
        managerNameLbl.setText(info[3].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[3].getManagerAge()));
        managerNatLbl.setText(info[3].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[3].getCaptainPic())));
        captainNameLbl.setText(info[3].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[3].getCaptainAge()));
        captainClubLbl.setText(info[3].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[3].getStarPic())));
        starNameLbl.setText(info[3].getStarName());
        starAgeLbl.setText(Integer.toString(info[3].getStarAge()));
        starClubLbl.setText(info[3].getStarClub());
        }
    }
    
    public void argentina(){
        TeamInformation arg = new TeamInformation();
        
        managerPic = "/teams/pictures/alejandro-sabella.png";
        managerName = "Alejandro Sabella";
        managerAge = 59;
        managerNation = "Argentine";
        captainPic = "/teams/pictures/Messi.png";
        captainName = "Lionel Messi";
        captainAge = 26;
        captainClub = "Barcelona";
        starPic = "/teams/pictures/Aguero.png";
        starName = "Sergio Aguero";
        starAge = 25;
        starClub = "Manchester City";
        
        arg.setManagerPic(managerPic);
        arg.setManagerName(managerName);
        arg.setManagerAge(managerAge);
        arg.setManagerNation(managerNation);
        arg.setCaptainPic(captainPic);
        arg.setCaptainName(captainName);
        arg.setCaptainAge(captainAge);
        arg.setCaptainClub(captainClub);
        arg.setStarPic(starPic);
        arg.setStarName(starName);
        arg.setStarAge(starAge);
        arg.setStarClub(starClub);
        
        //adding object to the array
        info[4] = arg;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[4].getManagerPic())));
        managerNameLbl.setText(info[4].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[4].getManagerAge()));
        managerNatLbl.setText(info[4].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[4].getCaptainPic())));
        captainNameLbl.setText(info[4].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[4].getCaptainAge()));
        captainClubLbl.setText(info[4].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[4].getStarPic())));
        starNameLbl.setText(info[4].getStarName());
        starAgeLbl.setText(Integer.toString(info[4].getStarAge()));
        starClubLbl.setText(info[4].getStarClub());
        }
    }
    
    public void germany(){
        TeamInformation ger = new TeamInformation();
        
        managerPic = "/teams/pictures/Joachim Low.fw.png";
        managerName = "Joachim Low";
        managerAge = 54;
        managerNation = "German";
        captainPic = "/teams/pictures/Philipp Lahm.fw.png";
        captainName = "Philipp Lahm";
        captainAge = 30;
        captainClub = "Bayern Munich"; 
        starPic = "/teams/pictures/Marco Reus.fw.png";
        starName = "Marco Reus";
        starAge = 24;
        starClub = "Borussia Dortmund";
        
        ger.setManagerPic(managerPic);
        ger.setManagerName(managerName);
        ger.setManagerAge(managerAge);
        ger.setManagerNation(managerNation);
        ger.setCaptainPic(captainPic);
        ger.setCaptainName(captainName);
        ger.setCaptainAge(captainAge);
        ger.setCaptainClub(captainClub);
        ger.setStarPic(starPic);
        ger.setStarName(starName);
        ger.setStarAge(starAge);
        ger.setStarClub(starClub);
        
        //adding object to the array
        info[5] = ger;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[5].getManagerPic())));
        managerNameLbl.setText(info[5].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[5].getManagerAge()));
        managerNatLbl.setText(info[5].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[5].getCaptainPic())));
        captainNameLbl.setText(info[5].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[5].getCaptainAge()));
        captainClubLbl.setText(info[5].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[5].getStarPic())));
        starNameLbl.setText(info[5].getStarName());
        starAgeLbl.setText(Integer.toString(info[5].getStarAge()));
        starClubLbl.setText(info[5].getStarClub());
        }
    }
    
    public void russia(){
        TeamInformation rus = new TeamInformation();
        
        managerPic = "/teams/pictures/Fabio Capello.fw.png";
        managerName = "Fabio Capello";
        managerAge = 67;
        managerNation = "Italian";
        captainPic = "/teams/pictures/Roman Shirokov.fw.png";
        captainName = "Roman Shirokov";
        captainAge = 32;
        captainClub = "FC Krasnodar"; 
        starPic = "/teams/pictures/Alan Dzagoev.fw.png";
        starName = "Alan Dzagoev";
        starAge = 23;
        starClub = "CSKA Moscow";
        
        rus.setManagerPic(managerPic);
        rus.setManagerName(managerName);
        rus.setManagerAge(managerAge);
        rus.setManagerNation(managerNation);
        rus.setCaptainPic(captainPic);
        rus.setCaptainName(captainName);
        rus.setCaptainAge(captainAge);
        rus.setCaptainClub(captainClub);
        rus.setStarPic(starPic);
        rus.setStarName(starName);
        rus.setStarAge(starAge);
        rus.setStarClub(starClub);
        
        //adding object to the array
        info[6] = rus;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[6].getManagerPic())));
        managerNameLbl.setText(info[6].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[6].getManagerAge()));
        managerNatLbl.setText(info[6].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[6].getCaptainPic())));
        captainNameLbl.setText(info[6].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[6].getCaptainAge()));
        captainClubLbl.setText(info[6].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[6].getStarPic())));
        starNameLbl.setText(info[6].getStarName());
        starAgeLbl.setText(Integer.toString(info[6].getStarAge()));
        starClubLbl.setText(info[6].getStarClub());
        }
    }
    
    public void italy(){
        TeamInformation ita = new TeamInformation();
        
        managerPic = "/teams/pictures/Cesare Prandelli.fw.png";
        managerName = "Cesare Prandelli";
        managerAge = 56;
        managerNation = "Italian";
        captainPic = "/teams/pictures/Buffon.fw.png";
        captainName = "Gianluigi Buffon";
        captainAge = 36;
        captainClub = "Juventus";      
        starPic = "/teams/pictures/Pirlo.fw.png";
        starName = "Andrea Pirlo";
        starAge = 34;
        starClub = "Juventus";
        
        ita.setManagerPic(managerPic);
        ita.setManagerName(managerName);
        ita.setManagerAge(managerAge);
        ita.setManagerNation(managerNation);
        ita.setCaptainPic(captainPic);
        ita.setCaptainName(captainName);
        ita.setCaptainAge(captainAge);
        ita.setCaptainClub(captainClub);
        ita.setStarPic(starPic);
        ita.setStarName(starName);
        ita.setStarAge(starAge);
        ita.setStarClub(starClub);
        
        //adding object to the array
        info[7] = ita;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[7].getManagerPic())));
        managerNameLbl.setText(info[7].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[7].getManagerAge()));
        managerNatLbl.setText(info[7].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[7].getCaptainPic())));
        captainNameLbl.setText(info[7].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[7].getCaptainAge()));
        captainClubLbl.setText(info[7].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[7].getStarPic())));
        starNameLbl.setText(info[7].getStarName());
        starAgeLbl.setText(Integer.toString(info[7].getStarAge()));
        starClubLbl.setText(info[7].getStarClub());
        }
    }
    
    public void uruguay(){
        TeamInformation urg = new TeamInformation();
        
        managerPic = "/teams/pictures/Oscar Tabarez.fw.png";
        managerName = "Oscar Tabarez";
        managerAge = 67;
        managerNation = "Uruguayan";        
        captainPic = "/teams/pictures/Lugano.fw.png";
        captainName = "Diego Lugano";
        captainAge = 33;
        captainClub = "West Bromwich Albion";      
        starPic = "/teams/pictures/Luis Suarez.fw.png";
        starName = "Luis Suarez";
        starAge = 27;
        starClub = "Liverpool";
        
        urg.setManagerPic(managerPic);
        urg.setManagerName(managerName);
        urg.setManagerAge(managerAge);
        urg.setManagerNation(managerNation);
        urg.setCaptainPic(captainPic);
        urg.setCaptainName(captainName);
        urg.setCaptainAge(captainAge);
        urg.setCaptainClub(captainClub);
        urg.setStarPic(starPic);
        urg.setStarName(starName);
        urg.setStarAge(starAge);
        urg.setStarClub(starClub);
        
        //adding object to the array
        info[8] = urg;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[8].getManagerPic())));
        managerNameLbl.setText(info[8].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[8].getManagerAge()));
        managerNatLbl.setText(info[8].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[8].getCaptainPic())));
        captainNameLbl.setText(info[8].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[8].getCaptainAge()));
        captainClubLbl.setText(info[8].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[8].getStarPic())));
        starNameLbl.setText(info[8].getStarName());
        starAgeLbl.setText(Integer.toString(info[8].getStarAge()));
        starClubLbl.setText(info[8].getStarClub());
        }
    }
    
    public void portugal(){
        TeamInformation por = new TeamInformation();
        
        managerPic = "/teams/pictures/Paulo Bento.fw.png";
        managerName = "Paulo Bento";
        managerAge = 44;
        managerNation = "Portuguese";       
        captainPic = "/teams/pictures/Cristiano Ronaldo.fw.png";
        captainName = "Cristiano Ronaldo";
        captainAge = 29;
        captainClub = "Real Madrid";      
        starPic = "/teams/pictures/Pepe.fw.png";
        starName = "Pepe";
        starAge = 31;
        starClub = "Real Madrid";
        
        por.setManagerPic(managerPic);
        por.setManagerName(managerName);
        por.setManagerAge(managerAge);
        por.setManagerNation(managerNation);
        por.setCaptainPic(captainPic);
        por.setCaptainName(captainName);
        por.setCaptainAge(captainAge);
        por.setCaptainClub(captainClub);
        por.setStarPic(starPic);
        por.setStarName(starName);
        por.setStarAge(starAge);
        por.setStarClub(starClub);
        
        //adding object to the array
        info[9] = por;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[9].getManagerPic())));
        managerNameLbl.setText(info[9].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[9].getManagerAge()));
        managerNatLbl.setText(info[9].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[9].getCaptainPic())));
        captainNameLbl.setText(info[9].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[9].getCaptainAge()));
        captainClubLbl.setText(info[9].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[9].getStarPic())));
        starNameLbl.setText(info[9].getStarName());
        starAgeLbl.setText(Integer.toString(info[9].getStarAge()));
        starClubLbl.setText(info[9].getStarClub());
        }
    }
    
    public void bosnia(){
        TeamInformation bosn = new TeamInformation();
        
        managerPic = "/teams/pictures/Safet Susic.fw.png";
        managerName = "Safet Susic";
        managerAge = 58;
        managerNation = "Bosnian";       
        captainPic = "/teams/pictures/Emir Spahic.fw.png";
        captainName = "Emir Spahic";
        captainAge = 33;
        captainClub = "Bayer Leverkusen";      
        starPic = "/teams/pictures/Miralem Pjanic.fw.png";
        starName = "Miralem Pjanic";
        starAge = 23;
        starClub = "Roma";
        
        bosn.setManagerPic(managerPic);
        bosn.setManagerName(managerName);
        bosn.setManagerAge(managerAge);
        bosn.setManagerNation(managerNation);
        bosn.setCaptainPic(captainPic);
        bosn.setCaptainName(captainName);
        bosn.setCaptainAge(captainAge);
        bosn.setCaptainClub(captainClub);
        bosn.setStarPic(starPic);
        bosn.setStarName(starName);
        bosn.setStarAge(starAge);
        bosn.setStarClub(starClub);
        
        //adding object to the array
        info[10] = bosn;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[10].getManagerPic())));
        managerNameLbl.setText(info[10].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[10].getManagerAge()));
        managerNatLbl.setText(info[10].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[10].getCaptainPic())));
        captainNameLbl.setText(info[10].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[10].getCaptainAge()));
        captainClubLbl.setText(info[10].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[10].getStarPic())));
        starNameLbl.setText(info[10].getStarName());
        starAgeLbl.setText(Integer.toString(info[10].getStarAge()));
        starClubLbl.setText(info[10].getStarClub());
        }
    }
    
    public void belgium(){
        TeamInformation bel = new TeamInformation();
        
        managerPic = "/teams/pictures/Marc Wilmots.fw.png";
        managerName = "Marc Wilmots";
        managerAge = 45;
        managerNation = "Belgian";
        captainPic = "/teams/pictures/Vincent Kompany.fw.png";
        captainName = "Vincent Kompany";
        captainAge = 27;
        captainClub = "Manchester City";      
        starPic = "/teams/pictures/Eden Hazard.fw.png";
        starName = "Eden Hazard";
        starAge = 23;
        starClub = "Chelsea";
        
        bel.setManagerPic(managerPic);
        bel.setManagerName(managerName);
        bel.setManagerAge(managerAge);
        bel.setManagerNation(managerNation);
        bel.setCaptainPic(captainPic);
        bel.setCaptainName(captainName);
        bel.setCaptainAge(captainAge);
        bel.setCaptainClub(captainClub);
        bel.setStarPic(starPic);
        bel.setStarName(starName);
        bel.setStarAge(starAge);
        bel.setStarClub(starClub);
        
        //adding object to the array
        info[11] = bel;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[11].getManagerPic())));
        managerNameLbl.setText(info[11].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[11].getManagerAge()));
        managerNatLbl.setText(info[11].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[11].getCaptainPic())));
        captainNameLbl.setText(info[11].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[11].getCaptainAge()));
        captainClubLbl.setText(info[11].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[11].getStarPic())));
        starNameLbl.setText(info[11].getStarName());
        starAgeLbl.setText(Integer.toString(info[11].getStarAge()));
        starClubLbl.setText(info[11].getStarClub());
        }
    }
    
    public void colombia(){
        TeamInformation col = new TeamInformation();
        
        managerPic = "/teams/pictures/Jose Pekerman.fw.png";
        managerName = "Jose Pekerman";
        managerAge = 64;
        managerNation = "Argentine";
        captainPic = "/teams/pictures/Mario Yepes.fw.png";
        captainName = "Mario Yepes";
        captainAge = 38;
        captainClub = "Atalanta";      
        starPic = "/teams/pictures/Falcao.fw.png";
        starName = "Radamel Falcao";
        starAge = 28;
        starClub = "AS Monaco";
               
        col.setManagerPic(managerPic);
        col.setManagerName(managerName);
        col.setManagerAge(managerAge);
        col.setManagerNation(managerNation);
        col.setCaptainPic(captainPic);
        col.setCaptainName(captainName);
        col.setCaptainAge(captainAge);
        col.setCaptainClub(captainClub);
        col.setStarPic(starPic);
        col.setStarName(starName);
        col.setStarAge(starAge);
        col.setStarClub(starClub);
        
        //adding object to the array
        info[12] = col;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[12].getManagerPic())));
        managerNameLbl.setText(info[12].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[12].getManagerAge()));
        managerNatLbl.setText(info[12].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[12].getCaptainPic())));
        captainNameLbl.setText(info[12].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[12].getCaptainAge()));
        captainClubLbl.setText(info[12].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[12].getStarPic())));
        starNameLbl.setText(info[12].getStarName());
        starAgeLbl.setText(Integer.toString(info[12].getStarAge()));
        starClubLbl.setText(info[12].getStarClub());
        }
    }
    
    public void ecuador(){
        TeamInformation ecu = new TeamInformation();
        
        managerPic = "/teams/pictures/Reinaldo Rueda.fw.png";
        managerName = "Reinaldo Rueda";
        managerAge = 56;
        managerNation = "Colombian";      
        captainPic = "/teams/pictures/Antonio Valencia.fw.png";
        captainName = "Antonio Valencia";
        captainAge = 28;
        captainClub = "Manchester United";      
        starPic = "/teams/pictures/Jefferson Montero.fw.png";
        starName = "Jefferson Montero";
        starAge = 24;
        starClub = "Monarcas Morelia";
                 
        ecu.setManagerPic(managerPic);
        ecu.setManagerName(managerName);
        ecu.setManagerAge(managerAge);
        ecu.setManagerNation(managerNation);
        ecu.setCaptainPic(captainPic);
        ecu.setCaptainName(captainName);
        ecu.setCaptainAge(captainAge);
        ecu.setCaptainClub(captainClub);
        ecu.setStarPic(starPic);
        ecu.setStarName(starName);
        ecu.setStarAge(starAge);
        ecu.setStarClub(starClub);
        
        //adding object to the array
        info[13] = ecu;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[13].getManagerPic())));
        managerNameLbl.setText(info[13].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[13].getManagerAge()));
        managerNatLbl.setText(info[13].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[13].getCaptainPic())));
        captainNameLbl.setText(info[13].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[13].getCaptainAge()));
        captainClubLbl.setText(info[13].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[13].getStarPic())));
        starNameLbl.setText(info[13].getStarName());
        starAgeLbl.setText(Integer.toString(info[13].getStarAge()));
        starClubLbl.setText(info[13].getStarClub());
        }
    }
    
    public void costaRica(){
        TeamInformation cosR = new TeamInformation();
        
        managerPic = "/teams/pictures/Jorge Luis Pinto.fw.png";
        managerName = "Jorge Luis Pinto";
        managerAge = 61;
        managerNation = "Colombian";  
        captainPic = "/teams/pictures/Bryan Ruiz.fw.png";
        captainName = "Bryan Ruiz";
        captainAge = 28;
        captainClub = "PSV Eindhoven";      
        starPic = "/teams/pictures/Joel Campbell.fw.png";
        starName = "Joel Campbell";
        starAge = 21;
        starClub = "Olympiacos";
                 
        cosR.setManagerPic(managerPic);
        cosR.setManagerName(managerName);
        cosR.setManagerAge(managerAge);
        cosR.setManagerNation(managerNation);
        cosR.setCaptainPic(captainPic);
        cosR.setCaptainName(captainName);
        cosR.setCaptainAge(captainAge);
        cosR.setCaptainClub(captainClub);
        cosR.setStarPic(starPic);
        cosR.setStarName(starName);
        cosR.setStarAge(starAge);
        cosR.setStarClub(starClub);
        
        //adding object to the array
        info[14] = cosR;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[14].getManagerPic())));
        managerNameLbl.setText(info[14].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[14].getManagerAge()));
        managerNatLbl.setText(info[14].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[14].getCaptainPic())));
        captainNameLbl.setText(info[14].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[14].getCaptainAge()));
        captainClubLbl.setText(info[14].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[14].getStarPic())));
        starNameLbl.setText(info[14].getStarName());
        starAgeLbl.setText(Integer.toString(info[14].getStarAge()));
        starClubLbl.setText(info[14].getStarClub());
        }
    }
    
    public void honduras(){
        TeamInformation hon = new TeamInformation();
        
        managerPic = "/teams/pictures/Luis Fernando Suarez.fw.png";
        managerName = "Luis Fernando Suarez";
        managerAge = 54;
        managerNation = "Colombian";    
        captainPic = "/teams/pictures/Noel Valladares.fw.png";
        captainName = "Noel Valladares";
        captainAge = 36;
        captainClub = "Olimpia";      
        starPic = "/teams/pictures/Carlos Costly.fw.png";
        starName = "Carlos Costly";
        starAge = 31;
        starClub = "Real C.D. España";
                    
        hon.setManagerPic(managerPic);
        hon.setManagerName(managerName);
        hon.setManagerAge(managerAge);
        hon.setManagerNation(managerNation);
        hon.setCaptainPic(captainPic);
        hon.setCaptainName(captainName);
        hon.setCaptainAge(captainAge);
        hon.setCaptainClub(captainClub);
        hon.setStarPic(starPic);
        hon.setStarName(starName);
        hon.setStarAge(starAge);
        hon.setStarClub(starClub);
        
        //adding object to the array
        info[15] = hon;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[15].getManagerPic())));
        managerNameLbl.setText(info[15].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[15].getManagerAge()));
        managerNatLbl.setText(info[15].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[15].getCaptainPic())));
        captainNameLbl.setText(info[15].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[15].getCaptainAge()));
        captainClubLbl.setText(info[15].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[15].getStarPic())));
        starNameLbl.setText(info[15].getStarName());
        starAgeLbl.setText(Integer.toString(info[15].getStarAge()));
        starClubLbl.setText(info[15].getStarClub());
        }
    }
    
    public void iran(){
        TeamInformation irn = new TeamInformation();
        
        managerPic = "/teams/pictures/Carlos Queiroz.fw.png";
        managerName = "Carlos Queiroz";
        managerAge = 61;
        managerNation = "Portuguese";         
        captainPic = "/teams/pictures/Javad Nekounam.fw.png";
        captainName = "Javad Nekounam";
        captainAge = 33;
        captainClub = "Kuwait SC";      
        starPic = "/teams/pictures/Ashkan Dejagah.fw.png";
        starName = "Ashkan Dejagah";
        starAge = 27;
        starClub = "Fulham";
                        
        irn.setManagerPic(managerPic);
        irn.setManagerName(managerName);
        irn.setManagerAge(managerAge);
        irn.setManagerNation(managerNation);
        irn.setCaptainPic(captainPic);
        irn.setCaptainName(captainName);
        irn.setCaptainAge(captainAge);
        irn.setCaptainClub(captainClub);
        irn.setStarPic(starPic);
        irn.setStarName(starName);
        irn.setStarAge(starAge);
        irn.setStarClub(starClub);
        
        //adding object to the array
        info[16] = irn;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[16].getManagerPic())));
        managerNameLbl.setText(info[16].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[16].getManagerAge()));
        managerNatLbl.setText(info[16].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[16].getCaptainPic())));
        captainNameLbl.setText(info[16].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[16].getCaptainAge()));
        captainClubLbl.setText(info[16].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[16].getStarPic())));
        starNameLbl.setText(info[16].getStarName());
        starAgeLbl.setText(Integer.toString(info[16].getStarAge()));
        starClubLbl.setText(info[16].getStarClub());
        }
    }
    
    public void ivoryCoast(){
        TeamInformation ivoryC = new TeamInformation();
        
        managerPic = "/teams/pictures/Sabri Lamouchi.fw.png";
        managerName = "Sabri Lamouchi";
        managerAge = 42;
        managerNation = "French";            
        captainPic = "/teams/pictures/Didier Drogba.fw.png";
        captainName = "Didier Drogba";
        captainAge = 36;
        captainClub = "Galatasaray";      
        starPic = "/teams/pictures/Yaya Toure.fw.png";
        starName = "Yaya Toure";
        starAge = 30;
        starClub = "Manchester City";
                        
        ivoryC.setManagerPic(managerPic);
        ivoryC.setManagerName(managerName);
        ivoryC.setManagerAge(managerAge);
        ivoryC.setManagerNation(managerNation);
        ivoryC.setCaptainPic(captainPic);
        ivoryC.setCaptainName(captainName);
        ivoryC.setCaptainAge(captainAge);
        ivoryC.setCaptainClub(captainClub);
        ivoryC.setStarPic(starPic);
        ivoryC.setStarName(starName);
        ivoryC.setStarAge(starAge);
        ivoryC.setStarClub(starClub);
        
        //adding object to the array
        info[17] = ivoryC;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[17].getManagerPic())));
        managerNameLbl.setText(info[17].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[17].getManagerAge()));
        managerNatLbl.setText(info[17].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[17].getCaptainPic())));
        captainNameLbl.setText(info[17].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[17].getCaptainAge()));
        captainClubLbl.setText(info[17].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[17].getStarPic())));
        starNameLbl.setText(info[17].getStarName());
        starAgeLbl.setText(Integer.toString(info[17].getStarAge()));
        starClubLbl.setText(info[17].getStarClub());
        }
    }
    
    public void algeria(){
        TeamInformation alg = new TeamInformation();
        
        managerPic = "/teams/pictures/Valid Halilhodzic.fw.png";
        managerName = "Valid Halilhodzic";
        managerAge = 61;
        managerNation = "Bosnian";      
        captainPic = "/teams/pictures/Madjid Bougherra.fw.png";
        captainName = "Madjid Bougherra";
        captainAge = 31;
        captainClub = "Lekhwiya";      
        starPic = "/teams/pictures/Feghouli.fw.png";
        starName = "Sofiane Feghouli";
        starAge = 24;
        starClub = "Valencia CF";
                        
        alg.setManagerPic(managerPic);
        alg.setManagerName(managerName);
        alg.setManagerAge(managerAge);
        alg.setManagerNation(managerNation);
        alg.setCaptainPic(captainPic);
        alg.setCaptainName(captainName);
        alg.setCaptainAge(captainAge);
        alg.setCaptainClub(captainClub);
        alg.setStarPic(starPic);
        alg.setStarName(starName);
        alg.setStarAge(starAge);
        alg.setStarClub(starClub);
        
        //adding object to the array
        info[18] = alg;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[18].getManagerPic())));
        managerNameLbl.setText(info[18].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[18].getManagerAge()));
        managerNatLbl.setText(info[18].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[18].getCaptainPic())));
        captainNameLbl.setText(info[18].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[18].getCaptainAge()));
        captainClubLbl.setText(info[18].getCaptainClub());
        
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[18].getStarPic())));
        starNameLbl.setText(info[18].getStarName());
        starAgeLbl.setText(Integer.toString(info[18].getStarAge()));
        starClubLbl.setText(info[18].getStarClub());
        }
    }
    
    public void ghana(){
        TeamInformation gha = new TeamInformation();
        
        managerPic = "/teams/pictures/Kwesi Appiah.fw.png";
        managerName = "James Kwesi Appiah";
        managerAge = 53;
        managerNation = "Ghanaian";          
        captainPic = "/teams/pictures/Asamoah Gyan.fw.png";
        captainName = "Asamoah Gyan";
        captainAge = 28;
        captainClub = "Al Ain";      
        starPic = "/teams/pictures/Kevin-Prince-Boateng.fw.png";
        starName = "Kevin-Prince Boateng";
        starAge = 27;
        starClub = "Schalke 04";
                            
        gha.setManagerPic(managerPic);
        gha.setManagerName(managerName);
        gha.setManagerAge(managerAge);
        gha.setManagerNation(managerNation);
        gha.setCaptainPic(captainPic);
        gha.setCaptainName(captainName);
        gha.setCaptainAge(captainAge);
        gha.setCaptainClub(captainClub);
        gha.setStarPic(starPic);
        gha.setStarName(starName);
        gha.setStarAge(starAge);
        gha.setStarClub(starClub);
        
        //adding object to the array
        info[19] = gha;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[19].getManagerPic())));
        managerNameLbl.setText(info[19].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[19].getManagerAge()));
        managerNatLbl.setText(info[19].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[19].getCaptainPic())));
        captainNameLbl.setText(info[19].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[19].getCaptainAge()));
        captainClubLbl.setText(info[19].getCaptainClub());
       
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[19].getStarPic())));
        starNameLbl.setText(info[19].getStarName());
        starAgeLbl.setText(Integer.toString(info[19].getStarAge()));
        starClubLbl.setText(info[19].getStarClub());
        }
    }
    
    public void australia(){
        TeamInformation aus = new TeamInformation();
        
        managerPic = "/teams/pictures/Ange Postecoglou.fw.png";
        managerName = "Ange Postecoglou";
        managerAge = 48;
        managerNation = "Greek-Australian";          
        captainPic = "/teams/pictures/Mile Jedinak.fw.png";
        captainName = "Mile Jedinak";
        captainAge = 29;
        captainClub = "Crystal Palace";              
        starPic = "/teams/pictures/Tim Cahill.fw.png";
        starName = "Tim Cahill";
        starAge = 34;
        starClub = "New York Red Bulls";
                            
        aus.setManagerPic(managerPic);
        aus.setManagerName(managerName);
        aus.setManagerAge(managerAge);
        aus.setManagerNation(managerNation);
        aus.setCaptainPic(captainPic);
        aus.setCaptainName(captainName);
        aus.setCaptainAge(captainAge);
        aus.setCaptainClub(captainClub);
        aus.setStarPic(starPic);
        aus.setStarName(starName);
        aus.setStarAge(starAge);
        aus.setStarClub(starClub);
        
        //adding object to the array
        info[20] = aus;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[20].getManagerPic())));
        managerNameLbl.setText(info[20].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[20].getManagerAge()));
        managerNatLbl.setText(info[20].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[20].getCaptainPic())));
        captainNameLbl.setText(info[20].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[20].getCaptainAge()));
        captainClubLbl.setText(info[20].getCaptainClub());
       
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[20].getStarPic())));
        starNameLbl.setText(info[20].getStarName());
        starAgeLbl.setText(Integer.toString(info[20].getStarAge()));
        starClubLbl.setText(info[20].getStarClub());
        }
    }
    
    public void nigeria(){
        TeamInformation nig = new TeamInformation();
        
        managerPic = "/teams/pictures/Stephen Keshi.fw.png";
        managerName = "Stephen Keshi";
        managerAge = 52;
        managerNation = "Nigerian";                 
        captainPic = "/teams/pictures/Joseph Yobo.fw.png";
        captainName = "Joseph Yobo";
        captainAge = 33;
        captainClub = "Norwich City";              
        starPic = "/teams/pictures/Victor Moses.fw.png";
        starName = "Victor Moses";
        starAge = 23;
        starClub = "Liverpool";
                                 
        nig.setManagerPic(managerPic);
        nig.setManagerName(managerName);
        nig.setManagerAge(managerAge);
        nig.setManagerNation(managerNation);
        nig.setCaptainPic(captainPic);
        nig.setCaptainName(captainName);
        nig.setCaptainAge(captainAge);
        nig.setCaptainClub(captainClub);
        nig.setStarPic(starPic);
        nig.setStarName(starName);
        nig.setStarAge(starAge);
        nig.setStarClub(starClub);
        
        //adding object to the array
        info[21] = nig;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[21].getManagerPic())));
        managerNameLbl.setText(info[21].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[21].getManagerAge()));
        managerNatLbl.setText(info[21].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[21].getCaptainPic())));
        captainNameLbl.setText(info[21].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[21].getCaptainAge()));
        captainClubLbl.setText(info[21].getCaptainClub());
       
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[21].getStarPic())));
        starNameLbl.setText(info[21].getStarName());
        starAgeLbl.setText(Integer.toString(info[21].getStarAge()));
        starClubLbl.setText(info[21].getStarClub());
        }
    }
    
    public void japan(){
        TeamInformation jap = new TeamInformation();
        
        managerPic = "/teams/pictures/Alberto Zaccheroni.fw.png";
        managerName = "Alberto Zaccheroni";
        managerAge = 60;
        managerNation = "Italian";            
        captainPic = "/teams/pictures/Makoto Hasebe.fw.png";
        captainName = "Makoto Hasebe";
        captainAge = 30;
        captainClub = "FC Nürnberg";              
        starPic = "/teams/pictures/Honda.fw.png";
        starName = "Keisuke Honda";
        starAge = 27;
        starClub = "AC Milan";
                                 
        jap.setManagerPic(managerPic);
        jap.setManagerName(managerName);
        jap.setManagerAge(managerAge);
        jap.setManagerNation(managerNation);
        jap.setCaptainPic(captainPic);
        jap.setCaptainName(captainName);
        jap.setCaptainAge(captainAge);
        jap.setCaptainClub(captainClub);
        jap.setStarPic(starPic);
        jap.setStarName(starName);
        jap.setStarAge(starAge);
        jap.setStarClub(starClub);
        
        //adding object to the array
        info[22] = jap;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[22].getManagerPic())));
        managerNameLbl.setText(info[22].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[22].getManagerAge()));
        managerNatLbl.setText(info[22].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[22].getCaptainPic())));
        captainNameLbl.setText(info[22].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[22].getCaptainAge()));
        captainClubLbl.setText(info[22].getCaptainClub());
       
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[22].getStarPic())));
        starNameLbl.setText(info[22].getStarName());
        starAgeLbl.setText(Integer.toString(info[22].getStarAge()));
        starClubLbl.setText(info[22].getStarClub());
        }
    }
    
    public void korea(){
        TeamInformation kor = new TeamInformation();
        
        managerPic = "/teams/pictures/Hong-Myung Bo.fw.png";
        managerName = "Hong Myung-Bo";
        managerAge = 45;
        managerNation = "South Korean";          
        captainPic = "/teams/pictures/Chu-Young-Park.fw.png";
        captainName = "Park Chu-Young";
        captainAge = 28;
        captainClub = "Watford";              
        starPic = "/teams/pictures/Son Heung-Min.fw.png";
        starName = "Son Heung-Min";
        starAge = 21;
        starClub = "Bayer Leverkusen";
                                
        kor.setManagerPic(managerPic);
        kor.setManagerName(managerName);
        kor.setManagerAge(managerAge);
        kor.setManagerNation(managerNation);
        kor.setCaptainPic(captainPic);
        kor.setCaptainName(captainName);
        kor.setCaptainAge(captainAge);
        kor.setCaptainClub(captainClub);
        kor.setStarPic(starPic);
        kor.setStarName(starName);
        kor.setStarAge(starAge);
        kor.setStarClub(starClub);
        
        //adding object to the array
        info[23] = kor;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[23].getManagerPic())));
        managerNameLbl.setText(info[23].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[23].getManagerAge()));
        managerNatLbl.setText(info[23].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[23].getCaptainPic())));
        captainNameLbl.setText(info[23].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[23].getCaptainAge()));
        captainClubLbl.setText(info[23].getCaptainClub());
       
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[23].getStarPic())));
        starNameLbl.setText(info[23].getStarName());
        starAgeLbl.setText(Integer.toString(info[23].getStarAge()));
        starClubLbl.setText(info[23].getStarClub());
        }
    }
    
    public void usa(){
        TeamInformation myUsa = new TeamInformation();
        
        managerPic = "/teams/pictures/Jurgen Klinsmann.fw.png";
        managerName = "Jurgen Klinsmann";
        managerAge = 49;
        managerNation = "German";     
        captainPic = "/teams/pictures/Clint Dempsey.fw.png";
        captainName = "Clint Dempsey";
        captainAge = 31;
        captainClub = "Seattle Sounders FC";              
        starPic = "/teams/pictures/Michael Bradley.fw.png";
        starName = "Michael Bradley";
        starAge = 26;
        starClub = "Toronto FC";
                                
        myUsa.setManagerPic(managerPic);
        myUsa.setManagerName(managerName);
        myUsa.setManagerAge(managerAge);
        myUsa.setManagerNation(managerNation);
        myUsa.setCaptainPic(captainPic);
        myUsa.setCaptainName(captainName);
        myUsa.setCaptainAge(captainAge);
        myUsa.setCaptainClub(captainClub);
        myUsa.setStarPic(starPic);
        myUsa.setStarName(starName);
        myUsa.setStarAge(starAge);
        myUsa.setStarClub(starClub);
        
        //adding object to the array
        info[24] = myUsa;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[24].getManagerPic())));
        managerNameLbl.setText(info[24].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[24].getManagerAge()));
        managerNatLbl.setText(info[24].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[24].getCaptainPic())));
        captainNameLbl.setText(info[24].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[24].getCaptainAge()));
        captainClubLbl.setText(info[24].getCaptainClub());
       
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[24].getStarPic())));
        starNameLbl.setText(info[24].getStarName());
        starAgeLbl.setText(Integer.toString(info[24].getStarAge()));
        starClubLbl.setText(info[24].getStarClub());
        }
    }
    
    public void switzerland(){
        TeamInformation switz = new TeamInformation();
        
        managerPic = "/teams/pictures/Ottmar Hitzfeld.fw.png";
        managerName = "Ottmar Hitzfeld";
        managerAge = 65;
        managerNation = "German";     
        captainPic = "/teams/pictures/Inler.fw.png";
        captainName = "Gokhan Inler";
        captainAge = 29;
        captainClub = "Napoli";              
        starPic = "/teams/pictures/Shaqiri.fw.png";
        starName = "Xherdan Shaqiri";
        starAge = 22;
        starClub = "Bayern Munich";
                                    
        switz.setManagerPic(managerPic);
        switz.setManagerName(managerName);
        switz.setManagerAge(managerAge);
        switz.setManagerNation(managerNation);
        switz.setCaptainPic(captainPic);
        switz.setCaptainName(captainName);
        switz.setCaptainAge(captainAge);
        switz.setCaptainClub(captainClub);
        switz.setStarPic(starPic);
        switz.setStarName(starName);
        switz.setStarAge(starAge);
        switz.setStarClub(starClub);
        
        //adding object to the array
        info[25] = switz;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[25].getManagerPic())));
        managerNameLbl.setText(info[25].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[25].getManagerAge()));
        managerNatLbl.setText(info[25].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[25].getCaptainPic())));
        captainNameLbl.setText(info[25].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[25].getCaptainAge()));
        captainClubLbl.setText(info[25].getCaptainClub());
       
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[25].getStarPic())));
        starNameLbl.setText(info[25].getStarName());
        starAgeLbl.setText(Integer.toString(info[25].getStarAge()));
        starClubLbl.setText(info[25].getStarClub());
        }
    }
    
    public void chile(){
        TeamInformation chi = new TeamInformation();
        
        managerPic = "/teams/pictures/Jorge Sampaoli.fw.png";
        managerName = "Jorge Sampaoli";
        managerAge = 54;
        managerNation = "Argentine";         
        captainPic = "/teams/pictures/Claudio Bravo.fw.png";
        captainName = "Claudio Bravo";
        captainAge = 30;
        captainClub = "Real Sociedad";              
        starPic = "/teams/pictures/Alexis Sanchez.fw.png";
        starName = "Alexis Sanchez";
        starAge = 25;
        starClub = "Barcelona";
                                      
        chi.setManagerPic(managerPic);
        chi.setManagerName(managerName);
        chi.setManagerAge(managerAge);
        chi.setManagerNation(managerNation);
        chi.setCaptainPic(captainPic);
        chi.setCaptainName(captainName);
        chi.setCaptainAge(captainAge);
        chi.setCaptainClub(captainClub);
        chi.setStarPic(starPic);
        chi.setStarName(starName);
        chi.setStarAge(starAge);
        chi.setStarClub(starClub);
        
        //adding object to the array
        info[26] = chi;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[26].getManagerPic())));
        managerNameLbl.setText(info[26].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[26].getManagerAge()));
        managerNatLbl.setText(info[26].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[26].getCaptainPic())));
        captainNameLbl.setText(info[26].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[26].getCaptainAge()));
        captainClubLbl.setText(info[26].getCaptainClub());
       
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[26].getStarPic())));
        starNameLbl.setText(info[26].getStarName());
        starAgeLbl.setText(Integer.toString(info[26].getStarAge()));
        starClubLbl.setText(info[26].getStarClub());
        }
    }
    
    public void cameroon(){
        TeamInformation cam = new TeamInformation();
        
        managerPic = "/teams/pictures/Volker Finke.fw.png";
        managerName = "Volker Finke";
        managerAge = 65;
        managerNation = "German";                
        captainPic = "/teams/pictures/Samuel Eto'o.fw.png";
        captainName = "Samuel Eto'o";
        captainAge = 33;
        captainClub = "Chelsea";              
        starPic = "/teams/pictures/Alex Song.fw.png";
        starName = "Alex Song";
        starAge = 26;
        starClub = "Barcelona";
                                      
        cam.setManagerPic(managerPic);
        cam.setManagerName(managerName);
        cam.setManagerAge(managerAge);
        cam.setManagerNation(managerNation);
        cam.setCaptainPic(captainPic);
        cam.setCaptainName(captainName);
        cam.setCaptainAge(captainAge);
        cam.setCaptainClub(captainClub);
        cam.setStarPic(starPic);
        cam.setStarName(starName);
        cam.setStarAge(starAge);
        cam.setStarClub(starClub);
        
        //adding object to the array
        info[27] = cam;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[27].getManagerPic())));
        managerNameLbl.setText(info[27].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[27].getManagerAge()));
        managerNatLbl.setText(info[27].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[27].getCaptainPic())));
        captainNameLbl.setText(info[27].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[27].getCaptainAge()));
        captainClubLbl.setText(info[27].getCaptainClub());
       
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[27].getStarPic())));
        starNameLbl.setText(info[27].getStarName());
        starAgeLbl.setText(Integer.toString(info[27].getStarAge()));
        starClubLbl.setText(info[27].getStarClub());
        }
    }
    
    public void france(){
        TeamInformation fra = new TeamInformation();
        
        managerPic = "/teams/pictures/DD.png";
        managerName = "Didier Deschamps";
        managerAge = 45;
        managerNation = "French";    
        captainPic = "/teams/pictures/Hugo Lloris.png";
        captainName = "Hugo Lloris";
        captainAge = 27;
        captainClub = "Tottenham Hotspur";              
        starPic = "/teams/pictures/Franck Ribery.png";
        starName = "Franck Ribery";
        starAge = 30;
        starClub = "Bayern Munich";
                                          
        fra.setManagerPic(managerPic);
        fra.setManagerName(managerName);
        fra.setManagerAge(managerAge);
        fra.setManagerNation(managerNation);
        fra.setCaptainPic(captainPic);
        fra.setCaptainName(captainName);
        fra.setCaptainAge(captainAge);
        fra.setCaptainClub(captainClub);
        fra.setStarPic(starPic);
        fra.setStarName(starName);
        fra.setStarAge(starAge);
        fra.setStarClub(starClub);
        
        //adding object to the array
        info[28] = fra;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[28].getManagerPic())));
        managerNameLbl.setText(info[28].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[28].getManagerAge()));
        managerNatLbl.setText(info[28].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[28].getCaptainPic())));
        captainNameLbl.setText(info[28].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[28].getCaptainAge()));
        captainClubLbl.setText(info[28].getCaptainClub());
       
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[28].getStarPic())));
        starNameLbl.setText(info[28].getStarName());
        starAgeLbl.setText(Integer.toString(info[28].getStarAge()));
        starClubLbl.setText(info[28].getStarClub());
        }
    }
    
    public void greece(){
        TeamInformation gre = new TeamInformation();
        
        managerPic = "/teams/pictures/Fernando Santos.fw.png";
        managerName = "Fernando Santos";
        managerAge = 59;
        managerNation = "Portuguese";      
        captainPic = "/teams/pictures/Giorgos Karagounis.fw.png";
        captainName = "Giorgos Karagounis";
        captainAge = 37;
        captainClub = "Fulham";              
        starPic = "/teams/pictures/Kostas Mitroglou.fw.png";
        starName = "Kostas Mitroglou";
        starAge = 26;
        starClub = "Fulham";
                                          
        gre.setManagerPic(managerPic);
        gre.setManagerName(managerName);
        gre.setManagerAge(managerAge);
        gre.setManagerNation(managerNation);
        gre.setCaptainPic(captainPic);
        gre.setCaptainName(captainName);
        gre.setCaptainAge(captainAge);
        gre.setCaptainClub(captainClub);
        gre.setStarPic(starPic);
        gre.setStarName(starName);
        gre.setStarAge(starAge);
        gre.setStarClub(starClub);
        
        //adding object to the array
        info[29] = gre;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[29].getManagerPic())));
        managerNameLbl.setText(info[29].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[29].getManagerAge()));
        managerNatLbl.setText(info[29].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[29].getCaptainPic())));
        captainNameLbl.setText(info[29].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[29].getCaptainAge()));
        captainClubLbl.setText(info[29].getCaptainClub());
       
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[29].getStarPic())));
        starNameLbl.setText(info[29].getStarName());
        starAgeLbl.setText(Integer.toString(info[29].getStarAge()));
        starClubLbl.setText(info[29].getStarClub());
        }
    }
    
    public void croatia(){
        TeamInformation cro = new TeamInformation();
        
        managerPic = "/teams/pictures/Niko Kovac.fw.png";
        managerName = "Niko Kovac";
        managerAge = 42;
        managerNation = "Croatian";     
        captainPic = "/teams/pictures/Darijo Srna.fw.png";
        captainName = "Darijo Srna";
        captainAge = 31;
        captainClub = "Shakhtar Donetsk";              
        starPic = "/teams/pictures/Luka Modric.fw.png";
        starName = "Luka Modric";
        starAge = 28;
        starClub = "Real Madrid";
                                               
        cro.setManagerPic(managerPic);
        cro.setManagerName(managerName);
        cro.setManagerAge(managerAge);
        cro.setManagerNation(managerNation);
        cro.setCaptainPic(captainPic);
        cro.setCaptainName(captainName);
        cro.setCaptainAge(captainAge);
        cro.setCaptainClub(captainClub);
        cro.setStarPic(starPic);
        cro.setStarName(starName);
        cro.setStarAge(starAge);
        cro.setStarClub(starClub);
        
        //adding object to the array
        info[30] = cro;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[30].getManagerPic())));
        managerNameLbl.setText(info[30].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[30].getManagerAge()));
        managerNatLbl.setText(info[30].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[30].getCaptainPic())));
        captainNameLbl.setText(info[30].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[30].getCaptainAge()));
        captainClubLbl.setText(info[30].getCaptainClub());
       
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[30].getStarPic())));
        starNameLbl.setText(info[30].getStarName());
        starAgeLbl.setText(Integer.toString(info[30].getStarAge()));
        starClubLbl.setText(info[30].getStarClub());
        }
    }
    
    public void mexico(){
        TeamInformation mex = new TeamInformation();
        
        managerPic = "/teams/pictures/Miguel Herrera.fw.png";
        managerName = "Miguel Herrera";
        managerAge = 46;
        managerNation = "Mexican";    
        captainPic = "/teams/pictures/Rafael Marquez.fw.png";
        captainName = "Rafael Marquez";
        captainAge = 35;
        captainClub = "Club León";              
        starPic = "/teams/pictures/Javier Hernandez.fw.png";
        starName = "Javier Hernandez";
        starAge = 25;
        starClub = "Manchester United";
                                               
        mex.setManagerPic(managerPic);
        mex.setManagerName(managerName);
        mex.setManagerAge(managerAge);
        mex.setManagerNation(managerNation);
        mex.setCaptainPic(captainPic);
        mex.setCaptainName(captainName);
        mex.setCaptainAge(captainAge);
        mex.setCaptainClub(captainClub);
        mex.setStarPic(starPic);
        mex.setStarName(starName);
        mex.setStarAge(starAge);
        mex.setStarClub(starClub);
        
        //adding object to the array
        info[31] = mex;
        
        for(int i = 0; i < info.length;i++){        
        managerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[31].getManagerPic())));
        managerNameLbl.setText(info[31].getManagerName());
        managerAgeLbl.setText(Integer.toString(info[31].getManagerAge()));
        managerNatLbl.setText(info[31].getManagerNation());
        
        captainPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[31].getCaptainPic())));
        captainNameLbl.setText(info[31].getCaptainName());
        captainAgeLbl.setText(Integer.toString(info[31].getCaptainAge()));
        captainClubLbl.setText(info[31].getCaptainClub());
       
        starPlayerPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(info[31].getStarPic())));
        starNameLbl.setText(info[31].getStarName());
        starAgeLbl.setText(Integer.toString(info[31].getStarAge()));
        starClubLbl.setText(info[31].getStarClub());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        managerLbl = new javax.swing.JLabel();
        managerNameLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        managerAgeLbl = new javax.swing.JLabel();
        natLbl = new javax.swing.JLabel();
        managerNatLbl = new javax.swing.JLabel();
        managerInfoBtn = new javax.swing.JButton();
        managerPicLbl = new javax.swing.JLabel();
        managerBackLbl = new javax.swing.JLabel();
        captainInfoBtn = new javax.swing.JButton();
        captainPicLbl = new javax.swing.JLabel();
        captainLbl = new javax.swing.JLabel();
        age2Lbl = new javax.swing.JLabel();
        clubLbl = new javax.swing.JLabel();
        captainNameLbl = new javax.swing.JLabel();
        captainAgeLbl = new javax.swing.JLabel();
        captainClubLbl = new javax.swing.JLabel();
        captainBackLbl = new javax.swing.JLabel();
        starPlayerInfoBtn = new javax.swing.JButton();
        starPlayerPicLbl = new javax.swing.JLabel();
        starLbl = new javax.swing.JLabel();
        age3Lbl = new javax.swing.JLabel();
        club2Lbl = new javax.swing.JLabel();
        starNameLbl = new javax.swing.JLabel();
        starAgeLbl = new javax.swing.JLabel();
        starClubLbl = new javax.swing.JLabel();
        starBackLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        squadBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        player1Lbl = new javax.swing.JLabel();
        player2Lbl = new javax.swing.JLabel();
        player3Lbl = new javax.swing.JLabel();
        player4Lbl = new javax.swing.JLabel();
        player5Lbl = new javax.swing.JLabel();
        player6Lbl = new javax.swing.JLabel();
        player7Lbl = new javax.swing.JLabel();
        player8Lbl = new javax.swing.JLabel();
        player9Lbl = new javax.swing.JLabel();
        player10Lbl = new javax.swing.JLabel();
        player11Lbl = new javax.swing.JLabel();
        player12Lbl = new javax.swing.JLabel();
        player13Lbl = new javax.swing.JLabel();
        player14Lbl = new javax.swing.JLabel();
        player15Lbl = new javax.swing.JLabel();
        player16Lbl = new javax.swing.JLabel();
        player17Lbl = new javax.swing.JLabel();
        player18Lbl = new javax.swing.JLabel();
        player19Lbl = new javax.swing.JLabel();
        player20Lbl = new javax.swing.JLabel();
        player21Lbl = new javax.swing.JLabel();
        player22Lbl = new javax.swing.JLabel();
        player23Lbl = new javax.swing.JLabel();
        title2Lbl = new javax.swing.JLabel();
        flagLbl = new javax.swing.JLabel();
        teamNameLbl = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        searchTF = new javax.swing.JTextField();
        teamsBtn = new javax.swing.JButton();
        home2Btn = new javax.swing.JButton();
        background2Lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Back Button.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.setContentAreaFilled(false);
        backBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/backHover.fw.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn);
        backBtn.setBounds(5, 5, 50, 50);

        managerLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        managerLbl.setText("Manager:");
        jPanel1.add(managerLbl);
        managerLbl.setBounds(170, 190, 61, 23);

        managerNameLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        jPanel1.add(managerNameLbl);
        managerNameLbl.setBounds(250, 190, 190, 23);

        ageLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        ageLbl.setText("Age:");
        jPanel1.add(ageLbl);
        ageLbl.setBounds(170, 220, 40, 23);

        managerAgeLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        jPanel1.add(managerAgeLbl);
        managerAgeLbl.setBounds(250, 220, 190, 23);

        natLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        natLbl.setText("Nationality:");
        jPanel1.add(natLbl);
        natLbl.setBounds(170, 250, 80, 23);

        managerNatLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        jPanel1.add(managerNatLbl);
        managerNatLbl.setBounds(250, 250, 190, 23);

        managerInfoBtn.setText("Manager Info");
        managerInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerInfoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(managerInfoBtn);
        managerInfoBtn.setBounds(320, 275, 120, 30);

        managerPicLbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        managerPicLbl.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(managerPicLbl);
        managerPicLbl.setBounds(10, 170, 150, 130);

        managerBackLbl.setBackground(new java.awt.Color(204, 204, 204));
        managerBackLbl.setFont(new java.awt.Font("DotumChe", 1, 13)); // NOI18N
        managerBackLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerBackLbl.setToolTipText("");
        managerBackLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        managerBackLbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        managerBackLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        managerBackLbl.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        managerBackLbl.setOpaque(true);
        jPanel1.add(managerBackLbl);
        managerBackLbl.setBounds(5, 160, 440, 150);

        captainInfoBtn.setText("Captain Info");
        captainInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captainInfoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(captainInfoBtn);
        captainInfoBtn.setBounds(320, 445, 120, 30);

        captainPicLbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        captainPicLbl.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(captainPicLbl);
        captainPicLbl.setBounds(10, 340, 150, 130);

        captainLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        captainLbl.setText("Captain:");
        jPanel1.add(captainLbl);
        captainLbl.setBounds(170, 360, 60, 23);

        age2Lbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        age2Lbl.setText("Age:");
        jPanel1.add(age2Lbl);
        age2Lbl.setBounds(170, 390, 29, 23);

        clubLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        clubLbl.setText("Club:");
        jPanel1.add(clubLbl);
        clubLbl.setBounds(170, 420, 33, 23);

        captainNameLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        jPanel1.add(captainNameLbl);
        captainNameLbl.setBounds(250, 360, 190, 23);

        captainAgeLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        jPanel1.add(captainAgeLbl);
        captainAgeLbl.setBounds(250, 390, 190, 23);

        captainClubLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        jPanel1.add(captainClubLbl);
        captainClubLbl.setBounds(250, 420, 190, 23);

        captainBackLbl.setBackground(new java.awt.Color(204, 204, 204));
        captainBackLbl.setFont(new java.awt.Font("DotumChe", 1, 13)); // NOI18N
        captainBackLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        captainBackLbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        captainBackLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        captainBackLbl.setOpaque(true);
        jPanel1.add(captainBackLbl);
        captainBackLbl.setBounds(5, 330, 440, 150);

        starPlayerInfoBtn.setText("Star Player Info");
        starPlayerInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starPlayerInfoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(starPlayerInfoBtn);
        starPlayerInfoBtn.setBounds(315, 615, 125, 30);

        starPlayerPicLbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        starPlayerPicLbl.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(starPlayerPicLbl);
        starPlayerPicLbl.setBounds(10, 510, 150, 130);

        starLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        starLbl.setText("Star Player:");
        jPanel1.add(starLbl);
        starLbl.setBounds(170, 530, 80, 23);

        age3Lbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        age3Lbl.setText("Age:");
        jPanel1.add(age3Lbl);
        age3Lbl.setBounds(170, 560, 40, 23);

        club2Lbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        club2Lbl.setText("Club:");
        jPanel1.add(club2Lbl);
        club2Lbl.setBounds(170, 590, 40, 23);

        starNameLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        jPanel1.add(starNameLbl);
        starNameLbl.setBounds(250, 530, 190, 23);

        starAgeLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        jPanel1.add(starAgeLbl);
        starAgeLbl.setBounds(250, 560, 190, 23);

        starClubLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        jPanel1.add(starClubLbl);
        starClubLbl.setBounds(250, 590, 190, 23);

        starBackLbl.setBackground(new java.awt.Color(204, 204, 204));
        starBackLbl.setFont(new java.awt.Font("DotumChe", 1, 13)); // NOI18N
        starBackLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        starBackLbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        starBackLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        starBackLbl.setOpaque(true);
        jPanel1.add(starBackLbl);
        starBackLbl.setBounds(5, 500, 440, 150);

        titleLbl.setFont(new java.awt.Font("Mangal", 0, 30)); // NOI18N
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Team Info");
        titleLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLbl.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(titleLbl);
        titleLbl.setBounds(170, 70, 160, 40);

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/homeButton2.png"))); // NOI18N
        homeBtn.setBorder(null);
        homeBtn.setContentAreaFilled(false);
        homeBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/homeHover.fw.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(homeBtn);
        homeBtn.setBounds(70, 5, 50, 50);

        squadBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Squads.fw.png"))); // NOI18N
        squadBtn.setBorder(null);
        squadBtn.setContentAreaFilled(false);
        squadBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/SquadsHover.fw.png"))); // NOI18N
        squadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squadBtnActionPerformed(evt);
            }
        });
        jPanel1.add(squadBtn);
        squadBtn.setBounds(135, 5, 100, 50);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/BackgroundNoText.jpg"))); // NOI18N
        jPanel1.add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 450, 700);

        jPanel2.setPreferredSize(new java.awt.Dimension(450, 700));
        jPanel2.setLayout(null);

        player1Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player1Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player1Lbl.setOpaque(true);
        jPanel2.add(player1Lbl);
        player1Lbl.setBounds(40, 180, 200, 20);

        player2Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player2Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player2Lbl.setOpaque(true);
        jPanel2.add(player2Lbl);
        player2Lbl.setBounds(40, 200, 200, 20);

        player3Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player3Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player3Lbl.setOpaque(true);
        jPanel2.add(player3Lbl);
        player3Lbl.setBounds(40, 220, 200, 20);

        player4Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player4Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player4Lbl.setOpaque(true);
        jPanel2.add(player4Lbl);
        player4Lbl.setBounds(40, 240, 200, 20);

        player5Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player5Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player5Lbl.setOpaque(true);
        jPanel2.add(player5Lbl);
        player5Lbl.setBounds(40, 260, 200, 20);

        player6Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player6Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player6Lbl.setOpaque(true);
        jPanel2.add(player6Lbl);
        player6Lbl.setBounds(40, 280, 200, 20);

        player7Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player7Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player7Lbl.setOpaque(true);
        jPanel2.add(player7Lbl);
        player7Lbl.setBounds(40, 300, 200, 20);

        player8Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player8Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player8Lbl.setOpaque(true);
        jPanel2.add(player8Lbl);
        player8Lbl.setBounds(40, 320, 200, 20);

        player9Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player9Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player9Lbl.setOpaque(true);
        jPanel2.add(player9Lbl);
        player9Lbl.setBounds(40, 340, 200, 20);

        player10Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player10Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player10Lbl.setOpaque(true);
        jPanel2.add(player10Lbl);
        player10Lbl.setBounds(40, 360, 200, 20);

        player11Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player11Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player11Lbl.setOpaque(true);
        jPanel2.add(player11Lbl);
        player11Lbl.setBounds(40, 380, 200, 20);

        player12Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player12Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player12Lbl.setOpaque(true);
        jPanel2.add(player12Lbl);
        player12Lbl.setBounds(40, 400, 200, 20);

        player13Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player13Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player13Lbl.setOpaque(true);
        jPanel2.add(player13Lbl);
        player13Lbl.setBounds(40, 420, 200, 20);

        player14Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player14Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player14Lbl.setOpaque(true);
        jPanel2.add(player14Lbl);
        player14Lbl.setBounds(40, 440, 200, 20);

        player15Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player15Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player15Lbl.setOpaque(true);
        jPanel2.add(player15Lbl);
        player15Lbl.setBounds(40, 460, 200, 20);

        player16Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player16Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player16Lbl.setOpaque(true);
        jPanel2.add(player16Lbl);
        player16Lbl.setBounds(40, 480, 200, 20);

        player17Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player17Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player17Lbl.setOpaque(true);
        jPanel2.add(player17Lbl);
        player17Lbl.setBounds(40, 500, 200, 20);

        player18Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player18Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player18Lbl.setOpaque(true);
        jPanel2.add(player18Lbl);
        player18Lbl.setBounds(40, 520, 200, 20);

        player19Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player19Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player19Lbl.setOpaque(true);
        jPanel2.add(player19Lbl);
        player19Lbl.setBounds(40, 540, 200, 20);

        player20Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player20Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player20Lbl.setOpaque(true);
        jPanel2.add(player20Lbl);
        player20Lbl.setBounds(40, 560, 200, 20);

        player21Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player21Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player21Lbl.setOpaque(true);
        jPanel2.add(player21Lbl);
        player21Lbl.setBounds(40, 580, 200, 20);

        player22Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player22Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player22Lbl.setOpaque(true);
        jPanel2.add(player22Lbl);
        player22Lbl.setBounds(40, 600, 200, 20);

        player23Lbl.setBackground(new java.awt.Color(255, 255, 255));
        player23Lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        player23Lbl.setOpaque(true);
        jPanel2.add(player23Lbl);
        player23Lbl.setBounds(40, 620, 200, 20);

        title2Lbl.setFont(new java.awt.Font("Mangal", 0, 30)); // NOI18N
        title2Lbl.setText("Squads");
        jPanel2.add(title2Lbl);
        title2Lbl.setBounds(200, 70, 110, 52);
        jPanel2.add(flagLbl);
        flagLbl.setBounds(260, 180, 150, 150);

        teamNameLbl.setBackground(new java.awt.Color(255, 255, 255));
        teamNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teamNameLbl.setOpaque(true);
        jPanel2.add(teamNameLbl);
        teamNameLbl.setBounds(260, 350, 150, 20);

        searchBtn.setText("Search Squad");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel2.add(searchBtn);
        searchBtn.setBounds(110, 660, 120, 30);
        jPanel2.add(searchTF);
        searchTF.setBounds(230, 660, 150, 30);

        teamsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/TeamsButton.fw.png"))); // NOI18N
        teamsBtn.setBorder(null);
        teamsBtn.setContentAreaFilled(false);
        teamsBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/TeamsButtonHover.fw.png"))); // NOI18N
        teamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(teamsBtn);
        teamsBtn.setBounds(5, 5, 100, 50);

        home2Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/homeButton2.png"))); // NOI18N
        home2Btn.setBorder(null);
        home2Btn.setContentAreaFilled(false);
        home2Btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/homeHover.fw.png"))); // NOI18N
        home2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home2BtnActionPerformed(evt);
            }
        });
        jPanel2.add(home2Btn);
        home2Btn.setBounds(115, 5, 50, 50);

        background2Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/BackgroundNoText.jpg"))); // NOI18N
        jPanel2.add(background2Lbl);
        background2Lbl.setBounds(0, 0, 450, 700);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 450, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        Teams b  = new Teams();
        b.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String search = searchTF.getText();
        
        player1Lbl.setVisible(true);
        player2Lbl.setVisible(true);
        player3Lbl.setVisible(true);
        player4Lbl.setVisible(true);
        player5Lbl.setVisible(true);
        player6Lbl.setVisible(true);
        player7Lbl.setVisible(true);
        player8Lbl.setVisible(true);
        player9Lbl.setVisible(true);
        player10Lbl.setVisible(true);
        player11Lbl.setVisible(true);
        player12Lbl.setVisible(true);
        player13Lbl.setVisible(true);
        player14Lbl.setVisible(true);
        player15Lbl.setVisible(true);
        player16Lbl.setVisible(true);
        player17Lbl.setVisible(true);
        player18Lbl.setVisible(true);
        player19Lbl.setVisible(true);
        player20Lbl.setVisible(true);
        player21Lbl.setVisible(true);
        player22Lbl.setVisible(true);
        player23Lbl.setVisible(true);
        teamNameLbl.setVisible(true);
        
        for(Squad x:squadList){
            if(search.equalsIgnoreCase(x.getTeamName())){
            teamNameLbl.setText(x.getTeamName());
            player1Lbl.setText(x.getPlayer1());
            player2Lbl.setText(x.getPlayer2());
            player3Lbl.setText(x.getPlayer3());
            player4Lbl.setText(x.getPlayer4());
            player5Lbl.setText(x.getPlayer5());
            player6Lbl.setText(x.getPlayer6());
            player7Lbl.setText(x.getPlayer7());
            player8Lbl.setText(x.getPlayer8());
            player9Lbl.setText(x.getPlayer9());
            player10Lbl.setText(x.getPlayer10());
            player11Lbl.setText(x.getPlayer11());
            player12Lbl.setText(x.getPlayer12());
            player13Lbl.setText(x.getPlayer13());
            player14Lbl.setText(x.getPlayer14());
            player15Lbl.setText(x.getPlayer15());
            player16Lbl.setText(x.getPlayer16());
            player17Lbl.setText(x.getPlayer17());
            player18Lbl.setText(x.getPlayer18());
            player19Lbl.setText(x.getPlayer19());
            player20Lbl.setText(x.getPlayer20());
            player21Lbl.setText(x.getPlayer21());
            player22Lbl.setText(x.getPlayer22());
            player23Lbl.setText(x.getPlayer23());
            flagLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(x.getFlag()))); 
            }
         }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        WorldCup home = new WorldCup();
        home.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void squadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squadBtnActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();        //https://www.youtube.com/watch?v=nm5ULDfbKD0&noredirect=1
        jPanel1.repaint();          //https://www.youtube.com/watch?v=nm5ULDfbKD0&noredirect=1
        jPanel1.revalidate();       //https://www.youtube.com/watch?v=nm5ULDfbKD0&noredirect=1
            
        jPanel1.add(jPanel2);       //https://www.youtube.com/watch?v=nm5ULDfbKD0&noredirect=1
        jPanel1.repaint();          //https://www.youtube.com/watch?v=nm5ULDfbKD0&noredirect=1
        jPanel1.revalidate();       //https://www.youtube.com/watch?v=nm5ULDfbKD0&noredirect=1
        
        searchBtn.setVisible(true);
        searchTF.setVisible(true);
        teamsBtn.setVisible(true);
        home2Btn.setVisible(true);
        
        player1Lbl.setVisible(false);
        player2Lbl.setVisible(false);
        player3Lbl.setVisible(false);
        player4Lbl.setVisible(false);
        player5Lbl.setVisible(false);
        player6Lbl.setVisible(false);
        player7Lbl.setVisible(false);
        player8Lbl.setVisible(false);
        player9Lbl.setVisible(false);
        player10Lbl.setVisible(false);
        player11Lbl.setVisible(false);
        player12Lbl.setVisible(false);
        player13Lbl.setVisible(false);
        player14Lbl.setVisible(false);
        player15Lbl.setVisible(false);
        player16Lbl.setVisible(false);
        player17Lbl.setVisible(false);
        player18Lbl.setVisible(false);
        player19Lbl.setVisible(false);
        player20Lbl.setVisible(false);
        player21Lbl.setVisible(false);
        player22Lbl.setVisible(false);
        player23Lbl.setVisible(false);
        teamNameLbl.setVisible(false);
        
        JOptionPane.showMessageDialog(null, "Please enter the name of the team who's squad you wish to see");
        
        //call each countrys squad method
        this.englandSquad();
        this.spainSquad();
        this.germanySquad();
        this.belgiumSquad();
        this.franceSquad();
        this.hollandSquad();
        this.bosniaSquad();
        this.croatiaSquad();
        this.greeceSquad();
        this.italySquad();
        this.portugalSquad();
        this.russiaSquad();
        this.switzerlandSquad();
        this.brazilSquad();
        this.argentinaSquad();
        this.chileSquad();
        this.colombiaSquad();
        this.ecuadorSquad();
        this.uruguaySquad();
        this.bosniaSquad();
        this.costaRicaSquad();
        this.hondurasSquad();
        this.mexicoSquad();
        this.usaSquad();
        this.algeriaSquad();
        this.cameroonSquad();
        this.ghanaSquad();
        this.ivoryCoastSquad();
        this.nigeriaSquad();
        this.koreaSquad();
        this.japanSquad();
        this.australiaSquad();
        this.iranSquad();
    }//GEN-LAST:event_squadBtnActionPerformed

    private void teamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamsBtnActionPerformed
        // TODO add your handling code here:
        Teams myTeams = new Teams();
        myTeams.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_teamsBtnActionPerformed

    private void home2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home2BtnActionPerformed
        // TODO add your handling code here:
        WorldCup myHome = new WorldCup();
        myHome.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_home2BtnActionPerformed

    private void managerInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerInfoBtnActionPerformed
        ManagerInfoGUI myManager = new ManagerInfoGUI();
        myManager.setVisible(true);
        
        if(managerNameLbl.getText().equals("Roy Hodgson")){
            myManager.englandManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Luiz Felipe Scolari")){
            myManager.brazilManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Volker Finke")){
            myManager.cameroonManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Miguel Herrera")){
            myManager.mexicoManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Niko Kovac")){
            myManager.croatiaManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Vicente del Bosque")){
            myManager.spainManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Joachim Low")){
            myManager.germanyManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Louis van Gaal")){
            myManager.hollandManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Fabio Capello")){
            myManager.russiaManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Paulo Bento")){
            myManager.portugalManagerProfile();
        }
        else if(managerNameLbl.getText().equals("James Kwesi Appiah")){
            myManager.ghanaManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Carlos Queiroz")){
            myManager.iranManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Ange Postecoglou")){
            myManager.australiaManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Alberto Zaccheroni")){
            myManager.japanManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Hong Myung-Bo")){
            myManager.koreaManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Valid Halilhodzic")){
            myManager.algeriaManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Sabri Lamouchi")){
            myManager.ivoryManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Stephen Keshi")){
            myManager.nigeriaManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Jurgen Klinsmann")){
            myManager.usaManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Jorge Luis Pinto")){
            myManager.costaRicaManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Luis Fernando Suarez")){
            myManager.hondurasManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Alejandro Sabella")){
            myManager.argentinaManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Jorge Sampaoli")){
            myManager.chileManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Jose Pekerman")){
            myManager.colombiaManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Reinaldo Rueda")){
            myManager.ecuadorManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Oscar Tabarez")){
            myManager.uruguayManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Marc Wilmots")){
            myManager.belgiumManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Safet Susic")){
            myManager.bosniaManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Didier Deschamps")){
            myManager.franceManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Fernando Santos")){
            myManager.greeceManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Cesare Prandelli")){
            myManager.italyManagerProfile();
        }
        else if(managerNameLbl.getText().equals("Ottmar Hitzfeld")){
            myManager.switzManagerProfile();
        }
        
        this.dispose();
    }//GEN-LAST:event_managerInfoBtnActionPerformed

    private void starPlayerInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starPlayerInfoBtnActionPerformed
        ManagerInfoGUI myManager = new ManagerInfoGUI();
        myManager.setVisible(true);
        
        if(starNameLbl.getText().equals("Wayne Rooney")){
            myManager.englandStarPlayer();
        }
        else if(starNameLbl.getText().equals("Neymar")){
            myManager.brazilStarPlayer();
        }
        else if(starNameLbl.getText().equals("Alex Song")){
            myManager.cameroonStarPlayer();
        }
        else if(starNameLbl.getText().equals("Javier Hernandez")){
            myManager.mexicoStarPlayer();
        }
        else if(starNameLbl.getText().equals("Luka Modric")){
            myManager.croatiaStarPlayer();
        }
        else if(starNameLbl.getText().equals("Andres Iniesta")){
            myManager.spainStarPlayer();
        }
        else if(starNameLbl.getText().equals("Marco Reus")){
            myManager.germanyStarPlayer();
        }
        else if(starNameLbl.getText().equals("Arjen Robben")){
            myManager.hollandStarPlayer();
        }
        else if(starNameLbl.getText().equals("Alan Dzagoev")){
            myManager.russiaStarPlayer();
        }
        else if(starNameLbl.getText().equals("Pepe")){
            myManager.portugalStarPlayer();
        }
        else if(starNameLbl.getText().equals("Kevin-Prince Boateng")){
            myManager.ghanaStarPlayer();
        }
        else if(starNameLbl.getText().equals("Ashkan Dejagah")){
            myManager.iranStarPlayer();
        }
        else if(starNameLbl.getText().equals("Tim Cahill")){
            myManager.australiaStarPlayer();
        }
        else if(starNameLbl.getText().equals("Keisuke Honda")){
            myManager.japanStarPlayer();
        }
        else if(starNameLbl.getText().equals("Son Heung-Min")){
            myManager.koreaStarPlayer();
        }
        else if(starNameLbl.getText().equals("Sofiane Feghouli")){
            myManager.algeriaStarPlayer();
        }
        else if(starNameLbl.getText().equals("Yaya Toure")){
            myManager.ivoryStarPlayer();
        }
        else if(starNameLbl.getText().equals("Victor Moses")){
            myManager.nigeriaStarPlayer();
        }
        else if(starNameLbl.getText().equals("Michael Bradley")){
            myManager.usaStarPlayer();
        }
        else if(starNameLbl.getText().equals("Joel Campbell")){
            myManager.costaRicaStarPlayer();
        }
        else if(starNameLbl.getText().equals("Carlos Costly")){
            myManager.hondurasStarPlayer();
        }
        else if(starNameLbl.getText().equals("Sergio Aguero")){
            myManager.argentinaStarPlayer();
        }
        else if(starNameLbl.getText().equals("Alexis Sanchez")){
            myManager.chileStarPlayer();
        }
        else if(starNameLbl.getText().equals("Radamel Falcao")){
            myManager.colombiaStarPlayer();
        }
        else if(starNameLbl.getText().equals("Jefferson Montero")){
            myManager.ecuadorStarPlayer();
        }
        else if(starNameLbl.getText().equals("Luis Suarez")){
            myManager.uruguayStarPlayer();
        }
        else if(starNameLbl.getText().equals("Eden Hazard")){
            myManager.belgiumStarPlayer();
        }
        else if(starNameLbl.getText().equals("Miralem Pjanic")){
            myManager.bosniaStarPlayer();
        }
        else if(starNameLbl.getText().equals("Franck Ribery")){
            myManager.franceStarPlayer();
        }
        else if(starNameLbl.getText().equals("Kostas Mitroglou")){
            myManager.greeceStarPlayer();
        }
        else if(starNameLbl.getText().equals("Andrea Pirlo")){
            myManager.italyStarPlayer();
        }
        else if(starNameLbl.getText().equals("Xherdan Shaqiri")){
            myManager.switzStarPlayer();
        }
        
        this.dispose();
    }//GEN-LAST:event_starPlayerInfoBtnActionPerformed

    private void captainInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captainInfoBtnActionPerformed
        ManagerInfoGUI myManager = new ManagerInfoGUI();
        myManager.setVisible(true);
        
        if(captainNameLbl.getText().equals("Steven Gerrard")){
            myManager.englandCaptain();
        }
        else if(captainNameLbl.getText().equals("Thiago Silva")){
            myManager.brazilCaptain();
        }
        else if(captainNameLbl.getText().equals("Samuel Eto'o")){
            myManager.cameroonCaptain();
        }
        else if(captainNameLbl.getText().equals("Rafael Marquez")){
            myManager.mexicoCaptain();
        }
        else if(captainNameLbl.getText().equals("Darijo Srna")){
            myManager.croatiaCaptain();
        }
        else if(captainNameLbl.getText().equals("Iker Casillas")){
            myManager.spainCaptain();
        }
        else if(captainNameLbl.getText().equals("Philipp Lahm")){
            myManager.germanyCaptain();
        }
        else if(captainNameLbl.getText().equals("Robin van Persie")){
            myManager.hollandCaptain();
        }
        else if(captainNameLbl.getText().equals("Roman Shirokov")){
            myManager.russiaCaptain();
        }
        else if(captainNameLbl.getText().equals("Cristiano Ronaldo")){
            myManager.portugalCaptain();
        }
        else if(captainNameLbl.getText().equals("Asamoah Gyan")){
            myManager.ghanaCaptain();
        }
        else if(captainNameLbl.getText().equals("Javad Nekounam")){
            myManager.iranCaptain();
        }
        else if(captainNameLbl.getText().equals("Mile Jedinak")){
            myManager.australiaCaptain();
        }
        else if(captainNameLbl.getText().equals("Makoto Hasebe")){
            myManager.japanCaptain();
        }
        else if(captainNameLbl.getText().equals("Park Chu-Young")){
            myManager.koreaCaptain();
        }
        else if(captainNameLbl.getText().equals("Madjid Bougherra")){
            myManager.algeriaCaptain();
        }
        else if(captainNameLbl.getText().equals("Didier Drogba")){
            myManager.ivoryCaptain();
        }
        else if(captainNameLbl.getText().equals("Joseph Yobo")){
            myManager.nigeriaCaptain();
        }
        else if(captainNameLbl.getText().equals("Clint Dempsey")){
            myManager.usaCaptain();
        }
        else if(captainNameLbl.getText().equals("Bryan Ruiz")){
            myManager.costaRicaCaptain();
        }
        else if(captainNameLbl.getText().equals("Noel Valladares")){
            myManager.hondurasCaptain();
        }
        else if(captainNameLbl.getText().equals("Lionel Messi")){
            myManager.argentinaCaptain();
        }
        else if(captainNameLbl.getText().equals("Claudio Bravo")){
            myManager.chileCaptain();
        }
        else if(captainNameLbl.getText().equals("Mario Yepes")){
            myManager.colombiaCaptain();
        }
        else if(captainNameLbl.getText().equals("Antonio Valencia")){
            myManager.ecuadorCaptain();
        }
        else if(captainNameLbl.getText().equals("Diego Lugano")){
            myManager.uruguayCaptain();
        }
        else if(captainNameLbl.getText().equals("Vincent Kompany")){
            myManager.belgiumCaptain();
        }
        else if(captainNameLbl.getText().equals("Emir Spahic")){
            myManager.bosniaCaptain();
        }
        else if(captainNameLbl.getText().equals("Hugo Lloris")){
            myManager.franceCaptain();
        }
        else if(captainNameLbl.getText().equals("Giorgos Karagounis")){
            myManager.greeceCaptain();
        }
        else if(captainNameLbl.getText().equals("Gianluigi Buffon")){
            myManager.italyCaptain();
        }
        else if(captainNameLbl.getText().equals("Gokhan Inler")){
            myManager.switzCaptain();
        }
        
        this.dispose();
    }//GEN-LAST:event_captainInfoBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeamsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeamsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeamsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeamsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeamsInfo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age2Lbl;
    private javax.swing.JLabel age3Lbl;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel background2Lbl;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JLabel captainAgeLbl;
    private javax.swing.JLabel captainBackLbl;
    private javax.swing.JLabel captainClubLbl;
    private javax.swing.JButton captainInfoBtn;
    private javax.swing.JLabel captainLbl;
    private javax.swing.JLabel captainNameLbl;
    private javax.swing.JLabel captainPicLbl;
    private javax.swing.JLabel club2Lbl;
    private javax.swing.JLabel clubLbl;
    private javax.swing.JLabel flagLbl;
    private javax.swing.JButton home2Btn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel managerAgeLbl;
    private javax.swing.JLabel managerBackLbl;
    private javax.swing.JButton managerInfoBtn;
    private javax.swing.JLabel managerLbl;
    private javax.swing.JLabel managerNameLbl;
    private javax.swing.JLabel managerNatLbl;
    private javax.swing.JLabel managerPicLbl;
    private javax.swing.JLabel natLbl;
    private javax.swing.JLabel player10Lbl;
    private javax.swing.JLabel player11Lbl;
    private javax.swing.JLabel player12Lbl;
    private javax.swing.JLabel player13Lbl;
    private javax.swing.JLabel player14Lbl;
    private javax.swing.JLabel player15Lbl;
    private javax.swing.JLabel player16Lbl;
    private javax.swing.JLabel player17Lbl;
    private javax.swing.JLabel player18Lbl;
    private javax.swing.JLabel player19Lbl;
    private javax.swing.JLabel player1Lbl;
    private javax.swing.JLabel player20Lbl;
    private javax.swing.JLabel player21Lbl;
    private javax.swing.JLabel player22Lbl;
    private javax.swing.JLabel player23Lbl;
    private javax.swing.JLabel player2Lbl;
    private javax.swing.JLabel player3Lbl;
    private javax.swing.JLabel player4Lbl;
    private javax.swing.JLabel player5Lbl;
    private javax.swing.JLabel player6Lbl;
    private javax.swing.JLabel player7Lbl;
    private javax.swing.JLabel player8Lbl;
    private javax.swing.JLabel player9Lbl;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTF;
    private javax.swing.JButton squadBtn;
    private javax.swing.JLabel starAgeLbl;
    private javax.swing.JLabel starBackLbl;
    private javax.swing.JLabel starClubLbl;
    private javax.swing.JLabel starLbl;
    private javax.swing.JLabel starNameLbl;
    private javax.swing.JButton starPlayerInfoBtn;
    private javax.swing.JLabel starPlayerPicLbl;
    private javax.swing.JLabel teamNameLbl;
    private javax.swing.JButton teamsBtn;
    private javax.swing.JLabel title2Lbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
