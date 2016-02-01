/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

/**
 *
 * @author: Ian Cunnngham
 * @student Number: x13114425
 * @File: ManagerInfoGUI.java
 */
public class ManagerInfoGUI extends javax.swing.JFrame {
        String teamName;
    /**
     * Creates new form ManagerInfoGUI
     */
    public ManagerInfoGUI() {
        initComponents();
        teamName = new String();
    }

    public void englandManagerProfile(){
        Manager man;
        
        man = new Manager("Roy Hodgson", 66, "Manager", "Liverpool, Fulham, West Brom, Blackburn", 25);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/RH.png")));
        teamName = "england";
    }
    
    public void englandStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Wayne Rooney", 28, "Player", 89, 38, "Manchester United");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/WR.png")));
        teamName = "england";
    }
    
    public void englandCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Steven Gerrard", 33, "Player", 109, 21, "Liverpool", 35, "2010");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Steven Gerrard.fw.png")));
        teamName = "england";
    }
    
    public void brazilManagerProfile(){
        Manager man;
        
        man = new Manager("Luiz Felipe Scolari", 65, "Manager", "Chelsea, Portugal", 20);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/LFS.png")));
        teamName = "brazil";
    }
    
    public void brazilStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Neymar", 22, "Player", 47, 30, "Barcelona");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Neymar.fw.png")));
        teamName = "brazil";
    }
    
    public void brazilCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Thiago Silva", 29, "Player", 45, 2, "Paris Saint-Germain", 18, "2012");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/TS.png")));
        teamName = "brazil";
    }
    
    public void cameroonManagerProfile(){
        Manager man;
        
        man = new Manager("Volker Finke", 65, "Manager", "Urawa Red Diamonds,  1. FC Köln", 10);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Volker Finke.fw.png")));
        teamName = "cameroon";
    }
    
    public void cameroonStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Alex Song", 26, "Player", 36, 0, "Barcelona");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Alex Song.fw.png")));
        teamName = "cameroon";
    }
    
    public void cameroonCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Samuel Eto'o", 33, "Player", 112, 55, "Chelsea", 32, "2009");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Samuel Eto'o.fw.png")));
        teamName = "cameroon";
    }
    
    public void mexicoManagerProfile(){
        Manager man;
        
        man = new Manager("Miguel Herrera", 46, "Manager", "Atlante, América", 6);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Miguel Herrera.fw.png")));
        teamName = "mexico";
    }
    
    public void mexicoStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Javier Hernandez", 25, "Player", 57, 35, "Manchester United");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Javier Hernandez.fw.png")));
        teamName = "mexico";
    }
    
    public void mexicoCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Rafael Marquez", 35, "Player", 118, 15, "Club Leon", 32, "2010");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Rafael Marquez.fw.png")));
        teamName = "mexico";
    }
    
    public void croatiaManagerProfile(){
        Manager man;
        
        man = new Manager("Niko Kovac", 42, "Manager", "Red Bull Salzburg(assistant), Croatia U21", 2);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Niko Kovac.fw.png")));
        teamName = "croatia";
    }
    
    public void croatiaStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Luka Modric", 28, "Player", 71, 8, "Real Madrid");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Luka Modric.fw.png")));
        teamName = "croatia";
    }
    
    public void croatiaCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Darijo Srna", 31, "Player", 111, 21, "Shakhtar Donetsk", 59, "2008");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Darijo Srna.fw.png")));
        teamName = "croatia";
    }
    
    public void spainManagerProfile(){
        Manager man;
        
        man = new Manager("Vicente del Bosque", 63, "Manager", "Real Madrid, Beşiktaş", 85);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/VDB.fw.png")));
        teamName = "spain";
    }
    
    public void spainStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Andres Iniesta", 29, "Player", 95, 11, "Barcelona");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Iniesta.fw.png")));
        teamName = "spain";
    }
    
    public void spainCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Iker Casillas", 32, "Player", 153, 0, "Real Madrid", 80, "2008");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/IC.fw.png")));
        teamName = "spain";
    }
    
    public void germanyManagerProfile(){
        Manager man;
        
        man = new Manager("Joachim Low", 54, "Manager", "VfB Stuttgart, Fenerbahçe, FK Austria Wien", 102);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Joachim Low.fw.png")));
        teamName = "germany";
    }
    
    public void germanyStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Marco Reus", 24, "Player", 19, 7, "Borussia Dortmund");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Marco Reus.fw.png")));
        teamName = "germany";
    }
    
    public void germanyCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Philipp Lahm", 30, "Player", 105, 5, "Bayern Munich", 42, "2010");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Philipp Lahm.fw.png")));
        teamName = "germany";
    }
    
    public void hollandManagerProfile(){
        Manager man;
        
        man = new Manager("Louis van Gaal", 62, "Manager", "Ajax, Bayern Munich, Barcelona", 19);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/LVG.fw.png")));
        teamName = "holland";
    }
    
    public void hollandStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Arjen Robben", 30, "Player", 73, 22, "Bayern Munich");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Robben.fw.png")));
        teamName = "holland";
    }
    
    public void hollandCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Robin van Persie", 30, "Player", 82, 41, "Manchester United", 14, "2012");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/RVP.fw.png")));
        teamName = "holland";
    }
    
    public void russiaManagerProfile(){
        Manager man;
        
        man = new Manager("Fabio Capello", 67, "Manager", "Real Madrid, Juventus, England", 16);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Fabio Capello.fw.png")));
        teamName = "russia";
    }
    
    public void russiaStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Alan Dzagoev", 23, "Player", 30, 8, "CSKA Moscow");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Alan Dzagoev.fw.png")));
        teamName = "russia";
    }
    
    public void russiaCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Roman Shirokov", 32, "Player", 41, 12, "FC Krasnodar", 11, "2012");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Roman Shirokov.fw.png")));
        teamName = "russia";
    }
    
    public void portugalManagerProfile(){
        Manager man;
        
        man = new Manager("Paulo Bento", 44, "Manager", "Sporting CP", 40);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Paulo Bento.fw.png")));
        teamName = "portugal";
    }
    
    public void portugalStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Pepe", 31, "Player", 57, 3, "Real Madrid");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Pepe.fw.png")));
        teamName = "portugal";
    }
    
    public void portugalCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Cristiano Ronaldo", 29, "Player", 110, 49, "Real Madrid", 57, "2008");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Cristiano Ronaldo.fw.png")));
        teamName = "portugal";
    }
    
    public void ghanaManagerProfile(){
        Manager man;
        
        man = new Manager("James Kwesi Appiah", 53, "Manager", "Ghana U23", 20);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Kwesi Appiah.fw.png")));
        teamName = "ghana";
    }
    
    public void ghanaStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Kevin-Prince Boateng", 27, "Player", 11, 2, "Schalke 04");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Kevin-Prince-Boateng.fw.png")));
        teamName = "ghana";
    }
    
    public void ghanaCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Asamoah Gyan", 28, "Player", 76, 39, "Al Ain", 23, "2012");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Asamoah Gyan.fw.png")));
        teamName = "ghana";
    }
    
    public void iranManagerProfile(){
        Manager man;
        
        man = new Manager("Carlos Queiroz", 61, "Manager", "Real Madrid, Manchester United(assistant)", 34);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Carlos Queiroz.fw.png")));
        teamName = "iran";
    }
    
    public void iranStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Ashkan Dejagah", 27, "Player", 11, 4, "Fulham");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Ashkan Dejagah.fw.png")));
        teamName = "iran";
    }
    
    public void iranCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Javad Nekounam", 33, "Player", 136, 37, "Kuwait SC", 50, "2008");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Javad Nekounam.fw.png")));
        teamName = "iran";
    }
    
    public void australiaManagerProfile(){
        Manager man;
        
        man = new Manager("Ange Postecoglou", 48, "Manager", "Brisbane Roar, Melbourne Victory", 1);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Ange Postecoglou.fw.png")));
        teamName = "australia";
    }
    
    public void australiaStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Tim Cahill", 34, "Player", 67, 31, "New York Red Bulls");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Tim Cahill.fw.png")));
        teamName = "australia";
    }
    
    public void australiaCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Mile Jedinak", 29, "Player", 43, 4, "Crystal Palace", 1, "2014");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Mile Jedinak.fw.png")));
        teamName = "australia";
    }
    
    public void japanManagerProfile(){
        Manager man;
        
        man = new Manager("Alberto Zaccheroni", 60, "Manager", "Lazio, Juventus", 51);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Alberto Zaccheroni.fw.png")));
        teamName = "japan";
    }
    
    public void japanStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Keisuke Honda", 27, "Player", 53, 20, "AC Milan");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Honda.fw.png")));
        teamName = "japan";
    }
    
    public void japanCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Makoto Hasebe", 30, "Player", 70, 2, "FC Nurnberg", 48, "2010");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Makoto Hasebe.fw.png")));
        teamName = "japan";
    }
    
    public void koreaManagerProfile(){
        Manager man;
        
        man = new Manager("Hong Myung-Bo", 45, "Manager", "South Korea U-23", 14);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Hong-Myung Bo.fw.png")));
        teamName = "korea";
    }
    
    public void koreaStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Son Heung-Min", 21, "Player", 23, 6, "Bayer Leverkusen");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Son Heung-Min.fw.png")));
        teamName = "korea";
    }
    
    public void koreaCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Park Chu-Young", 28, "Player", 62, 24, "Watford", 24, "2011");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Chu-Young-Park.fw.png")));
        teamName = "korea";
    }
    
    public void algeriaManagerProfile(){
        Manager man;
        
        man = new Manager("Vaild Halilhodzic", 61, "Manager", "Paris Saint-Germain, Dinamo Zagreb", 23);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Valid Halilhodzic.fw.png")));
        teamName = "algeria";
    }
    
    public void algeriaStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Sofiane Feghouli", 24, "Player", 17, 5, "Valencia CF");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Feghouli.fw.png")));
        teamName = "algeria";
    }
    
    public void algeriaCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Madjid Bougherra", 31, "Player", 60, 4, "Lekhwiya", 28, "2010");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Madjid Bougherra.fw.png")));
        teamName = "algeria";
    }
    
    public void ivoryManagerProfile(){
        Manager man;
        
        man = new Manager("Sabri Lamouchi", 42, "Manager", "None", 24);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Sabri Lamouchi.fw.png")));
        teamName = "ivory coast";
    }
    
    public void ivoryStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Yaya Toure", 30, "Player", 82, 16, "Manchester City");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Yaya Toure.fw.png")));
        teamName = "ivory coast";
    }
    
    public void ivoryCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Didier Drogba", 36, "Player", 99, 63, "Galatasaray", 24, "2012");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Didier Drogba.fw.png")));
        teamName = "ivory coast";
    }
    
    public void nigeriaManagerProfile(){
        Manager man;
        
        man = new Manager("Stephen Keshi", 52, "Manager", "Togo, Mali", 36);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Stephen Keshi.fw.png")));
        teamName = "nigeria";
    }
    
    public void nigeriaStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Victor Moses", 23, "Player", 17, 6, "Liverpool");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Victor Moses.fw.png")));
        teamName = "nigeria";
    }
    
    public void nigeriaCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Joseph Yobo", 33, "Player", 95, 7, "Norwich City", 23, "2010");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Joseph Yobo.fw.png")));
        teamName = "nigeria";
    }
    
    public void usaManagerProfile(){
        Manager man;
        
        man = new Manager("Jurgen Klinsmann", 49, "Manager", "Bayern Munich, Germany", 43);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Jurgen Klinsmann.fw.png")));
        teamName = "usa";
    }
    
    public void usaStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Michael Bradley", 26, "Player", 83, 12, "Toronto FC");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Michael Bradley.fw.png")));
        teamName = "usa";
    }
    
    public void usaCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Clint Dempsey", 31, "Player", 103, 36, "Seattle Sounders FC", 11, "2013");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Clint Dempsey.fw.png")));
        teamName = "usa";
    }
    
    public void costaRicaManagerProfile(){
        Manager man;
        
        man = new Manager("Jorge Luis Pinto", 61, "Manager", "El Nacional, Deportivo Táchira", 32);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Jorge Luis Pinto.fw.png")));
        teamName = "costa-rica";
    }
    
    public void costaRicaStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Joel Campbell", 21, "Player", 31, 9, "Olympiacos");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Joel Campbell.fw.png")));
        teamName = "costa-rica";
    }
    
    public void costaRicaCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Bryan Ruiz", 28, "Player", 62, 12, "PSV Eindhoven", 18, "2012");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Bryan Ruiz.fw.png")));
        teamName = "costa-rica";
    }
    
    public void hondurasManagerProfile(){
        Manager man;
        
        man = new Manager("Luis Fernando Suarez", 54, "Manager", "Atlético Nacional, Ecuador", 31);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Luis Fernando Suarez.fw.png")));
        teamName = "honduras";
    }
    
    public void hondurasStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Carlos Costly", 31, "Player", 68, 30, "Real C.D. Espana");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Carlos Costly.fw.png")));
        teamName = "honduras";
    }
    
    public void hondurasCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Noel Valladares", 36, "Player", 118, 0, "Olympia", 52, "2010");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Noel Valladares.fw.png")));
        teamName = "honduras";
    }
    
    public void argentinaManagerProfile(){
        Manager man;
        
        man = new Manager("Alejandro Sabella", 59, "Manager", "Estudiantes", 32);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/alejandro-sabella.png")));
        teamName = "argentina";
    }
    
    public void argentinaStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Sergio Aguero", 25, "Player", 47, 21, "Manchester City");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Aguero.png")));
        teamName = "argentina";
    }
    
    public void argentinaCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Lionel Messi", 26, "Player", 83, 37, "Barcelona", 29, "2011");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Messi.png")));
        teamName = "argentina";
    }
    
    public void chileManagerProfile(){
        Manager man;
        
        man = new Manager("Jorge Sampaoli", 54, "Manager", "Sport Emelec, Universidad de Chile", 25);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Jorge Sampaoli.fw.png")));
        teamName = "chile";
    }
    
    public void chileStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Alexis Sanchez", 25, "Player", 65, 22, "Barcelona");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Alexis Sanchez.fw.png")));
        teamName = "chile";
    }
    
    public void chileCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Claudio Bravo", 30, "Player", 78, 0, "Real Sociedad", 44, "2007");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Claudio Bravo.fw.png")));
        teamName = "chile";
    }
    
    public void colombiaManagerProfile(){
        Manager man;
        
        man = new Manager("Jose Pekerman", 64, "Manager", "Argentina, Toluca", 27);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Jose Pekerman.fw.png")));
        teamName = "colombia";
    }
    
    public void colombiaStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Radamel Falcao", 28, "Player", 51, 20, "AS Monaco");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Falcao.fw.png")));
        teamName = "colombia";
    }
    
    public void colombiaCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Mario Yepes", 38, "Player", 95, 6, "Atlanta", 26, "2010");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Mario Yepes.fw.png")));
        teamName = "colombia";
    }
    
    public void ecuadorManagerProfile(){
        Manager man;
        
        man = new Manager("Reinaldo Rueda", 56, "Manager", "Colombia, Honduras", 45);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Reinaldo Rueda.fw.png")));
        teamName = "ecuador";
    }
    
    public void ecuadorStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Jefferson Montero", 24, "Player", 37, 7, "Monarcas Morelia");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Jefferson Montero.fw.png")));
        teamName = "ecuador";
    }
    
    public void ecuadorCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Antonio Valencia", 28, "Player", 68, 8, "Manchester United", 20, "2012");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Antonio Valencia.fw.png")));
        teamName = "ecuador";
    }
    
    public void uruguayManagerProfile(){
        Manager man;
        
        man = new Manager("Oscar Tabarez", 67, "Manager", "Vélez Sársfield, Boca Juniors", 103);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Oscar Tabarez.fw.png")));
        teamName = "uruguay";
    }
    
    public void uruguayStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Luis Suarez", 27, "Player", 77, 38, "Liverpool");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Luis Suarez.fw.png")));
        teamName = "uruguay";
    }
    
    public void uruguayCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Diego Lugano", 33, "Player", 92, 9, "West Bromwich Albion", 42, "2010");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Lugano.fw.png")));
        teamName = "uruguay";
    }
    
    public void belgiumManagerProfile(){
        Manager man;
        
        man = new Manager("Marc Wilmots", 45, "Manager", "Schalke 04, Belgium(assistant)", 19);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Marc Wilmots.fw.png")));
        teamName = "belgium";
    }
    
    public void belgiumStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Eden Hazard", 23, "Player", 42, 5, "Chelsea");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Eden Hazard.fw.png")));
        teamName = "belgium";
    }
    
    public void belgiumCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Vincent Kompany", 27, "Player", 56, 4, "Manchester City", 24, "2011");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Vincent Kompany.fw.png")));
        teamName = "belgium";
    }
    
    public void bosniaManagerProfile(){
        Manager man;
        
        man = new Manager("Safet Susic", 58, "Manager", "Çaykur Rizespor, Ankaraspor", 40);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Safet Susic.fw.png")));
        teamName = "bosnia";
    }
    
    public void bosniaStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Miralem Pjanic", 23, "Player", 46, 8, "Roma");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Miralem Pjanic.fw.png")));
        teamName = "bosnia";
    }
    
    public void bosniaCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Emir Spahic", 33, "Player", 72, 3, "Bayer Leverkusen", 36, "2010");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Emir Spahic.fw.png")));
        teamName = "bosnia";
    }
    
    public void franceManagerProfile(){
        Manager man;
        
        man = new Manager("Didier Deschamps", 45, "Manager", "Monaco, Juventus, Marseille", 20);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/DD.png")));
        teamName = "france";
    }
    
    public void franceStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Franck Ribery", 30, "Player", 80, 16, "Bayern Munich");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Franck Ribery.png")));
        teamName = "france";
    }
    
    public void franceCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Hugo Lloris", 27, "Player", 54, 0, "Tottenham Hotspur", 22, "2012");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Hugo Lloris.png")));
        teamName = "france";
    }
    
    public void greeceManagerProfile(){
        Manager man;
        
        man = new Manager("Fernando Santos", 59, "Manager", "Benfica, AEK Athens", 42);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Fernando Santos.fw.png")));
        teamName = "greece";
    }
    
    public void greeceStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Kostas Mitroglou", 26, "Player", 28, 8, "Fulham");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Kostas Mitroglou.fw.png")));
        teamName = "greece";
    }
    
    public void greeceCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Giorgos Karagounis", 37, "Player", 132, 10, "Fulham", 35, "2010");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Giorgos Karagounis.fw.png")));
        teamName = "greece";
    }
    
    public void italyManagerProfile(){
        Manager man;
        
        man = new Manager("Cesare Prandelli", 56, "Manager", "Parma, Roma, Fiorentina", 35);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Cesare Prandelli.fw.png")));
        teamName = "italy";
    }
    
    public void italyStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Andrea Pirlo", 34, "Player", 108, 13, "Juventus");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Pirlo.fw.png")));
        teamName = "italy";
    }
    
    public void italyCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Gianluigi Buffon", 36, "Player", 139, 0, "Juventus", 61, "2008");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Buffon.fw.png")));
        teamName = "italy";
    }
    
    public void switzManagerProfile(){
        Manager man;
        
        man = new Manager("Ottmar Hitzfeld", 65, "Manager", "Borussia Dortmund, Bayern Munich", 55);
        jTextArea1.setText(man.getDetails());
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Ottmar Hitzfeld.fw.png")));
        teamName = "switzerland";
    }
    
    public void switzStarPlayer(){
        TeamMember star;
                
        star = new StarPlayer("Xherdan Shaqiri", 22, "Player", 30, 8, "Bayern Munich");
        jTextArea1.setText(star.getDetails());
        titleLbl.setText("Star Player Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Shaqiri.fw.png")));
        teamName = "switzerland";
    }
    
    public void switzCaptain(){
        StarPlayer cap;
                
        cap = new Captain("Gokhan Inler", 29, "Player", 67, 6, "Napoli", 37, "2010");
        jTextArea1.setText(cap.getDetails());
        titleLbl.setText("Captain Info");
        picLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Inler.fw.png")));
        teamName = "switzerland";
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        picLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        TeamsBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(450, 700));
        jPanel1.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 440, 270, 140);
        jPanel1.add(picLbl);
        picLbl.setBounds(150, 170, 150, 150);

        titleLbl.setFont(new java.awt.Font("Mangal", 0, 30)); // NOI18N
        titleLbl.setText("Manager Info");
        jPanel1.add(titleLbl);
        titleLbl.setBounds(170, 75, 270, 40);

        TeamsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/TeamsButton.fw.png"))); // NOI18N
        TeamsBtn.setBorder(null);
        TeamsBtn.setContentAreaFilled(false);
        TeamsBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/TeamsButtonHover.fw.png"))); // NOI18N
        TeamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(TeamsBtn);
        TeamsBtn.setBounds(135, 5, 100, 50);

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

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/BackgroundNoText.jpg"))); // NOI18N
        jPanel1.add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 450, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
       WorldCup myHome = new WorldCup();
       myHome.setVisible(true);
       
       this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void TeamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamsBtnActionPerformed
        Teams myTeams = new Teams();
        myTeams.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_TeamsBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        TeamsInfo myTeamInfo = new TeamsInfo();
        myTeamInfo.setVisible(true);
        
        if(teamName.equals("england")){
            myTeamInfo.england();
        }
        else if(teamName.equals("brazil")){
            myTeamInfo.brazil();
        }
        else if(teamName.equals("cameroon")){
            myTeamInfo.cameroon();
        }
        else if(teamName.equals("mexico")){
            myTeamInfo.mexico();
        }
        else if(teamName.equals("croatia")){
            myTeamInfo.croatia();
        }
        else if(teamName.equals("spain")){
            myTeamInfo.spain();
        }
        else if(teamName.equals("germany")){
            myTeamInfo.germany();
        }
        else if(teamName.equals("holland")){
            myTeamInfo.holland();
        }
        else if(teamName.equals("russia")){
            myTeamInfo.russia();
        }
        else if(teamName.equals("portugal")){
            myTeamInfo.portugal();
        }
        else if(teamName.equals("ghana")){
            myTeamInfo.ghana();
        }
        else if(teamName.equals("iran")){
            myTeamInfo.iran();
        }
        else if(teamName.equals("australia")){
            myTeamInfo.australia();
        }
        else if(teamName.equals("japan")){
            myTeamInfo.japan();
        }
        else if(teamName.equals("korea")){
            myTeamInfo.korea();
        }
        else if(teamName.equals("algeria")){
            myTeamInfo.algeria();
        }
        else if(teamName.equals("ivory coast")){
            myTeamInfo.ivoryCoast();
        }
        else if(teamName.equals("nigeria")){
            myTeamInfo.nigeria();
        }
        else if(teamName.equals("usa")){
            myTeamInfo.usa();
        }
        else if(teamName.equals("costa-rica")){
            myTeamInfo.costaRica();
        }
        else if(teamName.equals("honduras")){
            myTeamInfo.honduras();
        }
        else if(teamName.equals("argentina")){
            myTeamInfo.argentina();
        }
        else if(teamName.equals("chile")){
            myTeamInfo.chile();
        }
        else if(teamName.equals("colombia")){
            myTeamInfo.colombia();
        }
        else if(teamName.equals("ecuador")){
            myTeamInfo.ecuador();
        }
        else if(teamName.equals("uruguay")){
            myTeamInfo.uruguay();
        }
        else if(teamName.equals("belgium")){
            myTeamInfo.belgium();
        }
        else if(teamName.equals("bosnia")){
            myTeamInfo.bosnia();
        }
        else if(teamName.equals("france")){
            myTeamInfo.france();
        }
        else if(teamName.equals("greece")){
            myTeamInfo.greece();
        }
        else if(teamName.equals("italy")){
            myTeamInfo.italy();
        }
        else if(teamName.equals("switzerland")){
            myTeamInfo.switzerland();
        }
       
        this.dispose();
        
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerInfoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerInfoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerInfoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerInfoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerInfoGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TeamsBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel picLbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
