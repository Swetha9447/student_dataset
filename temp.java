import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class temp {
    public static void main(String[] args) throws IOException {
        String [] name = new String[]{"Zorina Abreu", "Zhen Abu-Zahra", "Zhanetta Adeyeye", "Yunzhe Afonso", "Youngjin Ahn", "Yu Ahn", "Yoon Akin-Aderibigbe", "Yookyung Alexander", "Yi-Shiuan Alsamdan", "Yingda Alter", "Ying Altmann", "Yi-Feng Alvarez", "Yi Aramendia", "Yaya Ashkenazi", "Yat-Lun Atri", "Yasuhiro Au", "Yanwen Aurori", "Yan Austin", "Ya-Han Bagdat", "Yael Bala", "Wushen Banovac", "Won Barakat", "Won Barnes", "William Barrett", "Willem Baxter", "William Baxter", "Wei Beatty", "Wayne Bechrakis", "Vivek Beistegui", "Viacheslav Benchimol", "Valle Berkman", "Uros Birkhofer", "Trent Blakely", "Tobias Blattman", "Timothy Bolton", "Tiffanie Bosson", "Thomas Brandt", "Thomas Braun", "Theodore Brodsky", "Thavin Bromberg", "Ted Brown", "Thanadtha Brown", "Taylor Buckley", "Taryn Canal", "Tara Cantrock", "Tanzeer Cao", "Tae Carrillo", "Tadamitsu Carrow", "Sung Casasayas", "Suanne Cautero", "Stuti Cha", "Stephen Chan", "Steven Chan", "Sompop Chang", "Spencer Chang", "Stephanie Chang", "Simond Chat", "Simon Chau", "Shiv Chayet", "Shannon Cheesebro", "Scott Chen", "Se Chen", "Sean Chen", "Seth Chen", "Sevag Chen", "Scott Cheng", "Satiya Cheung", "Sarah Chin", "Sara Chomitz", "Samuel Chou", "Sang Chou", "Sangjo Chou", "Samantha Chu", "Samaneh Chua", "Salas Chung", "Saeed Cilento", "Ryan Clark", "Sachie Clark", "Ryan Cloke", "Rui Cockle", "Roger Cooney", "Roger Coyle", "Rodriguez Crabtree", "Robert Crunelle", "Robert Cruse", "Robert Cusnir", "Robert Dahmubed", "Robert Darby", "Robert Davidowitz", "Rikin Davis", "Richard Dean", "Richard Del", "Remy Deomampo", "Rahul Dickstein", "Radu Donahue", "Preston Doorey", "Phill Doyle", "Philip Druckman", "Philip Duncan", "Peter Elia", "Peter Erickson", "Peter Espinosa", "Peter Ferrero", "Perez Figueiredo", "Patrick Fixler", "Patrick Flegal", "Patino Forsyth", "Pallavi Fox", "Owen Franzoni", "Ophir Friedman", "Obaid Friis", "Noelle Fu", "Noel Gambino", "Nicole Gao", "Nishant Gao", "Nicole Garcia", "Nicolas Gautam", "Neto Gautier", "Negrin Gee", "Nawaz Georges", "Nathan Gibb", "Natalie Glenn", "Nashat Goswamy", "Nancy Goto", "Muge Graves", "Montero Greene", "Mohtadi Greer", "Mohammed Grisi", "Miho Grobe", "Michelle Grusq", "Michael Guerra", "Michael Guill", "Michael Guinn", "Micha Gupta", "Michael Gupta", "Maxwell Ha", "Matthew Hagiwara", "Matthew Hanan", "Matthew Hawkins", "Matthew Hersom", "Matthew Hertzer", "Matt Heshmatpour", "Massimo Himmelfarb", "Masayoshi Ho", "Martinez Hofman", "Martina Hofstee", "Marshall Hoisington", "Mark Holtz", "Marissa Holzman", "Maria Hong"};
        String [] gender = new String[]{"Male","Female"};
        String [] department = new String[]{"Computer Science","Electrical","Mechanical","Civil","Chemical"};

        


        CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\sweth\\Desktop\\list.csv"));  // file address
        String  [] title = {"Register no","First name","Last name","Phone","Email","Gender","Address","Depart","Academic year","Date of admission","Date of birth"};
        writer.writeNext(title);
        for(int i=0;i<150;i++){
            String [] currName = name[i].split(" ");
            String line[] = new String[]{1000+i+"",currName[0],currName[1],phone(),idGenerator(99)+currName[0]+"@gmail.com",gender[idGenerator(2)],"null",department[idGenerator(5)],"2022","01-01-2022",idGenerator(31)+"-"+idGenerator(12)+"-2000"};
            writer.writeNext(line);
        }
        writer.flush();
    }

    public static int idGenerator(int high){
        Random rand = new Random();
        return rand.nextInt(high);
    }

    public static String phone(){
        String number = "9";
        for(int i=0;i<9;i++){
            Random rand = new Random();
            int a = rand.nextInt(9);
            number = number + a;
        }
        return number;
    }
}

