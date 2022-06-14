import java.util.*;
class Mod2{
public static void main(String args[]){
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(10);
al.add(20);
al.add(30);
Integer i[]=new Integer[al.size()];
i=al.toArray(i);
int sum=0,count=0;
for(int a:i) {
sum=sum+a;
count++;
}
int avg=sum/count;
System.out.println("Avg="+avg);


a.add("a");
a.add("b");
a.add("c");
a.add("d");
ListIterator<String>l = a.listIterator();
System.out.print("In forward direction\n");
while(l.hasNext()) //In forward direction
{
System.out.print("\t"+l.next()+"\t");
}
System.out.print("In backward direction\n");
while(l.hasPrevious()) //In backward direction
{
System.out.print(l.previous());
}
}
}

