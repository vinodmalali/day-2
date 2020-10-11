class employee
{
string name;
int age;
string city;
void person()
{
  system.out.println("the name is sourabh");
}
void personA()
{
   system.out.println("the age is 23");
}
void place()
{
  system.out.println("the city is chennai");
}
}
public class main
{
   public static void main(string args[])
   {
    employee e1=new employee();
    employee e2=new employee();
    e1.person();
    e1.personA();
    e1.place();
   }
}