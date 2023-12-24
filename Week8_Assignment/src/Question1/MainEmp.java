package Question1;

public class MainEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ProjectSerializer projectSerializer = new ProjectSerializer();
	        projectSerializer.elist1.add(new Employee("E001", "Harsha", "9383993933", "RTNagar", 1000));
	        projectSerializer.elist1.add(new Employee("E002", "Harish", "9354693933", "Jayanagar", 2000));
	        projectSerializer.elist1.add(new Employee("E003", "Meenal", "9383976833", "Malleswaram", 1500));

	        projectSerializer.elist2.add(new Employee("E004", "Sundar", "9334593933", "Vijayanagar", 3000));
	        projectSerializer.elist2.add(new Employee("E005", "Suman", "9383678933", "Indiranagar", 2000));
	        projectSerializer.elist2.add(new Employee("E006", "Suma", "9385493933", "KRPuram", 1750));

	        projectSerializer.elist3.add(new Employee("E007", "Chitra", "9383978933", "Koramangala", 4000));
	        projectSerializer.elist3.add(new Employee("E008", "Suraj", "9383992133", "Malleswaram", 3000));
	        projectSerializer.elist3.add(new Employee("E009", "Manu", "9345193933", "RTNagar", 2000));

	        projectSerializer.projectMap1.put(new Project("P1", "Music Synthesizer", 23), projectSerializer.elist1);
	        projectSerializer.projectMap1.put(new Project("P2", "Vehicle Movement Tracker", 13), projectSerializer.elist2);
	        projectSerializer.projectMap1.put(new Project("P3", "Liquid Viscosity Finder", 15), projectSerializer.elist3);

	        projectSerializer.serializeProjectDetails(projectSerializer.projectMap1);
	        projectSerializer.deserializeProjectDetails();
	    }

	}


