import game.Indoor;
import game.Outdoor;
import java.io.*;
class Indoor_Outdoor_games
{
protected void finalize()
{
System.out.println("Finalized method is invoked");
}
public static void main(String a[]) throws IOException

{
String nm,gm;
int i;
BufferedReader br = new BufferedReader(new
InputStreamReader(System.in));
System.out.println("enter no indoor player");
int n= Integer.parseInt(br.readLine());
Indoor in[]=new Indoor[n];
for(i=0;i<n;i++)
{
System.out.println("enter palyer name");

nm=br.readLine();
System.out.println("enter gamename");
gm=br.readLine();
in[i]=new Indoor(nm,gm);
}
System.out.println("enter no outdoor player");
int n1= Integer.parseInt(br.readLine());
Outdoor o[]=new Outdoor[n1];
for(i=0;i<n1;i++)
{
System.out.println("enter palyer name");
nm=br.readLine();
System.out.println("enter gamename");
gm=br.readLine();
o[i]=new Outdoor(nm,gm);
}
System.out.println("enter game name for indoor : ");
gm=br.readLine();
System.out.println("Player name of specified indoor game : ");

for(i=0;i<n;i++)
{
in[i].display(gm);
}
System.out.println("enter game name for outdoor : ");
gm=br.readLine();
System.out.println("Player name of specified outdoor game: ");

for(i=0;i<n1;i++)

{
o[i].display(gm);
}
Indoor_Outdoor_games ob = new Indoor_Outdoor_games();
ob.finalize();

}
}
