public class SwitchDemo
{
 public static void main(String args[])
 {
  int age=Integer.parseInt(args[0]);
  switch(age)
  {
	case 10:
		System.out.println("Child");
		break;
	case 20:
		System.out.println("Youngster");
		break;
	case 30:
		System.out.println("Middle age");
		break;
	default:
		System.out.println("Old age");
	}
	}
	}
		