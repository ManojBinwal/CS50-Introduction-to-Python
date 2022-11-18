enum Dept
{
	CS("John","Block A"), IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block");             //Constants must be capital
    String head;
    String location;
    private Dept(String head, String loc)
    {
       this.head = head;
       this.location = loc;
    }
    public String getHeadName(){
        return head;
    }
    public String getLocation(){
        return location;
    }
}

class EnumDemo
{
	public static void main(String[] args) 
		{
				Dept d = Dept.CS;
                Dept List[] = Dept.values();
                for(Dept x:List){
				System.out.print(x + " ");     //ordinal gives index
                }
                switch(d) {
                    case CS: System.out.println("\nJohnny - Block: A \n");
                    break;
                    case IT: System.out.println("Oscar - Block: B \n");
                    break;
                    case CIVIL: System.out.println("Pingu - Block: C \n");
                    break;
                    case ECE: System.out.println("Noddy - Block: C \n");
                    break;
                }

        }
    }
				