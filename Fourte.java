import java.util.Scanner;
public class numbergame {
public static void main(String args[]) {
	Scanner ob=new Scanner(System.in);
	int target=ob.nextInt();;
	int a=ob.nextInt();
	int b=ob.nextInt();
	int c=ob.nextInt();
	int d=ob.nextInt();
	boolean r=true;
	while(r) {
		if((a+b+c+d)==target) {
			System.out.println("a+b+c+d");
		}
		else if((a+b+c+d)==target) {
			System.out.println("a+b+c+d");
		}
		else if((a*b*c*d)==target)
			System.out.println("a*b*c*d");
		else if(((a+c)-(b+d))==target) {
			System.out.println("(a+c)+(b+d)");
		}
		else if((a+d)-(b+c)==target) {
			System.out.println("(a+d)-(b+c)");
		}
		else if((c+b)-(a+d)==target) {
			System.out.println("(c+b)-(a+d)");
		}
		else if(((b+d)-(a+c))==target) {
			System.out.println("(b+d)-(a+c)");
		}
		else if((a+b)-(d+c)==target) {
			System.out.println("(a+b)-(d+c)");
		}
		else if((d+c)-(a+b)==target) {
			System.out.println("(a+b)-(d+c)");
		}
		else if(((a*c)-(b*d))==target) {
			System.out.println("(a*c)-(b*d)");
		}
		else if((a*d)-(b*c)==target) {
			System.out.println("(a*d)-(b*c)");
		}
		else if((c*b)-(a*d)==target) {
			System.out.println("(c*b)-(a*d)");
		}
		else if(((b*d)-(a*c))==target) {
			System.out.println("(b*d)-(a*c)");
		}
		else if((a*b)-(d*c)==target) {
			System.out.println("(a*b)-(d*c)");
		}
		else if((d*c)-(a*b)==target) {
			System.out.println("(d*c)-(a*b)");
		}
		else if(((a-c)-(b-d))==target) {
			System.out.println("(a-c)-(b-d)");
		}
		else if((a-d)-(b-c)==target) {
			System.out.println("(a-d)-(b-c)");
		}
		else if((c-b)-(a-d)==target) {
			System.out.println("(c+b)-(a+d)");
		}
		else if(((b-d)-(a-c))==target) {
			System.out.println("(b-d)-(a-c)");
		}
		else if((a-b)-(d-c)==target) {
			System.out.println("(a-b)-(d-c)");
		}
		else if((d-c)-(a-b)==target) {
			System.out.println("(d-c)-(a-b)");
		}
		else if(((a/c)-(b/d))==target) {
			System.out.println("((a/c)-(b/d)");
		}
		else if(((a/d)-(b/c))==target) {
			System.out.println("(a/d)-(b/c)");
		}
		else if(((c/b)-(a-d))==target) {
			System.out.println("(c/b)-(a-d)");
		}
		else if(((b/d)-(a/c))==target) {
			System.out.println("(b/d)-(a/c)");
		}
		else if(((a/b)-(d/c))==target) {
			System.out.println("(a/b)-(d/c)");
		}
		else if(((d/c)-(a/b))==target) {
			System.out.println("(d/c)-(a/b)");
		}
		else if(((b+c)+(a-d))==target){
			System.out.println("(b+c)+(a-d)");
		}
		else if(((b+c)+(d-a))==target){
			System.out.println("(b+c)+(d-a)");
		}
		else if(((a+d)-(c-b))==target){
			System.out.println("(a+d)-(c-b)");
		}
		r=false;
		}
}
}