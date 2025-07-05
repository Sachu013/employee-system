public class developer extends employee
{

    private String proglang;

    public developer(String name, String department, double salary,String proglang)
    {
        super(name, department, salary);
        this.proglang = proglang;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Prgoramming Language: " + proglang);
    }
}
