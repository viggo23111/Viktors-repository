import java.util.ArrayList;

public class Founder {
    private String name;
    public ArrayList<Team> teams= new ArrayList<>();

    public Founder(String name){
        this.name=name;
    }

    private void showAllTeams(){
        for(Team a : teams)
        {
            System.out.println(a.getName());
        }
    }

    private void showTeamPlacements(){
      /*  ArrayList<Employee> employees = getUnsortedEmployeeList();

    Comparator<Team> compareById = (Employee o1, Employee o2) -> o1.getId().compareTo( o2.getId() );

    Collections.sort(employees, compareById);

    Collections.sort(employees, compareById.reversed());*/

        for(Team a : teams)
        {
            System.out.println(a.getName());
        }

    }


    private void showMatchDates(){
    }
}
