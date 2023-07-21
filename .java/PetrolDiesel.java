import java.util.*;
class total
{
    public int  petrol(int a,int b,int c,int d,int e)
    {
        int total_maintenance=60*e;
        int total_liter=(d*60)/a;
        int total_cost=total_maintenance+c+(total_liter*b);
        return total_cost;
    }
    public int  diesel(int a,int b,int c,int d,int e)
    {
        int total_maintenance=60*e;
        int total_liter=(d*60)/a;
        int total_cost=total_maintenance+c+(total_liter*b);
        return total_cost;
    }

}
class PetrolDiesel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Petrol Car Details \n");
        System.out.print("Enter the distance/Liter (Mileage) for petrol car :");
        int a1=sc.nextInt();
        System.out.print("Enter the fuel-cost/Liter for petrol :");
        int b1=sc.nextInt();
        System.out.print("Enter the showroom Price for petrol :");
        int c1=sc.nextInt();
        System.out.print("Enter the Average Monthly Run in kilometres for petrol car : ");
        int d1=sc.nextInt();
        System.out.print("Enter the Maintenance Cost per month for petrol car :");
        int e1=sc.nextInt();

        System.out.println("Enter the Diesel Car Details ");
        System.out.print("Enter the distance/Liter (Mileage) for  Diesel car :");
        int a2=sc.nextInt();
        System.out.print("Enter the fuel-cost/Liter for Diesel :");
        int b2=sc.nextInt();
        System.out.print("Enter the showroom Price for Diesel :");
        int c2=sc.nextInt();
        System.out.print("Enter the Average Monthly Run in kilometres for Diesel car : ");
        int d2=sc.nextInt();
        System.out.print("Enter the Maintenance Cost per month for Diesel car :");
        int e2=sc.nextInt();        

        total sv=new total();
        int petrol_car=sv.petrol(a1,b1,c1,d1,e1);
        int diesel_car=sv.diesel(a2,b2,c2,d2,e2);
        System.out.println("Petrol Car  total Cost after 60 months :"+petrol_car);
        System.out.println("Diesel Car  total Cost after 60 months :"+diesel_car);
        if(petrol_car < diesel_car)
        {
            System.out.println("Petrol Car is more efficient");
        }
        else{
            System.out.println("Diesel Car is more efficient");
        }
    }
}