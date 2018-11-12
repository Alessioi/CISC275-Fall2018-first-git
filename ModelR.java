import java.util.*;

public class ModelR {
	
   //playing field for the game, boat will move across top row. other entitys will be below
   Entities[][] field = new Entities[10][10];
   Entities boat = new Player();
   Entities bucket = new Net();
	int score;
	ArrayList<Entities> objs = new ArrayList<Entities>();
	Direction currDirection = Direction.STOP;
	Timer t;
	boolean isMoving;
	int x;
	int y;
   //String that stores user command when not using view/controller
   String command = "";
	
	public ModelR() {
      boat.y = 0;
      boat.x = 4;
      bucket.y = 1;
      bucket.x = 4;
      field[0][4] = boat;
      field[1][4] = bucket;
   }
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Direction getDirection() {
		return currDirection;
	}
	
	public void genObj() {
         Entities temp;
         Random random = new Random();
         
         if(random.nextInt() % 5 == 0)
         {
            temp = new Trash();
         }
         else if(random.nextInt() % 4 == 1)
         {
            temp = new BlueCrab();  
         }
         else if(random.nextInt() % 3 == 2)
         {
            temp = new Weakfish();  
         }
         else if(random.nextInt() % 2 == 3)
         {
            temp = new HorseshoeCrab();  
         }
         else
         {
            temp = new Loggerhead();  
         }
         objs.add(temp);
   }
	
	public void moveObj(Entities obj) {
      try
      {
         //determines if there is a collision to occur
         if(field[obj.y][obj.x] != null)
         {
            if(field[obj.y][obj.x] == obj)
            {
               //nothing
            }
            else
            {
               collisionRes(obj, field[obj.y][obj.x]);
            }
         }
         
         //goes through
         if(obj.flow == Direction.RIGHT)
         {
            field[obj.y][obj.x - 1] = null;
            field[obj.y][obj.x] = obj;
         }
         else if(obj.flow == Direction.LEFT)
         {
            field[obj.y][obj.x + 1] = null;
            field[obj.y][obj.x] = obj;
         }
         else if(obj.flow == Direction.UP)
         {
            field[obj.y + 1][obj.x] = null;
            field[obj.y][obj.x] = obj;
         }
         else if(obj.flow == Direction.DOWN)
         {
            field[obj.y - 1][obj.x] = null;
            field[obj.y][obj.x] = obj;
         }
         else
         {
            field[obj.y][obj.x] = obj;
         }
      } 
      catch(ArrayIndexOutOfBoundsException e)
      {
         if(obj.flow == Direction.LEFT)
         {
            field[obj.y][obj.x - 1] = null;
            field[obj.y][obj.x] = obj;
         }
         else if(obj.flow == Direction.RIGHT)
         {
            field[obj.y][obj.x + 1] = null;
            field[obj.y][obj.x] = obj;
         }
      }
   }
   //will compare two objects trying to share the same space on the board and resolve based on comparison
   public void collisionRes(Entities a, Entities b)
   {
      if(a instanceof Net)
      {
         addPoints(b);
         b.catchObj();
      }
      else if(b instanceof Net)
      {
         addPoints(a);
         a.catchObj();
      }
      else
      {
         //does nothing for now, unless object is picked up by net then objects will pass through each other
      }
   }
   
	public String printBoard()
   {  
      String b = "";
      for( int i = 0 ; i < 10 ; i++)
      {
         for(int j = 0; j < 10 ; j++)
         {  
            //if there is an entity in space on board
            if(field[i][j] != null && field[i][j].isCaught != true)
            {
               //this tree determines which kind of entity is present in this spot
               if(field[i][j] instanceof Player)
               {
                  b = b + "B ";
               }
               else if(field[i][j] instanceof Net)
               {
                  b = b + "N ";
               }
               else if(field[i][j] instanceof Animal) 
               {
                  if(field[i][j] instanceof Loggerhead)
                  {
                     b = b + "L ";
                  }
                  else if(field[i][j] instanceof BlueCrab)
                  {
                     b = b + "C ";
                  }
                  else if(field[i][j] instanceof Weakfish)
                  {
                     b = b + "F ";
                  }
                  else if(field[i][j] instanceof HorseshoeCrab)
                  {
                     b = b + "H ";
                  }
                  
               }
               else if(field[i][j] instanceof Trash)
               {
                  b = b + "0 ";
               }
            }
            else
            {  
               b = b + "W ";
            }
         }
         b = b + "\n";
         //separates surface level from underwater
         if( i == 0 )
         {
            b = b + "---------------------------\n";
         }
      }
      return b + "\n";  
   }
   
   //goes through all entities, besides player and changes the position of them.
   //when object reaches end of board switch direction
   public void increment()
   {
      for(int i = 0; i < objs.size() ; i++)
      {
         if(objs.get(i).flow == Direction.LEFT)
         {
            objs.get(i).x = (objs.get(i).x - 1) % 10;
            if(objs.get(i).x == 0)
            {
               objs.get(i).flow = Direction.RIGHT;
            }
         }
         else
         {
            objs.get(i).x = (objs.get(i).x + 1) % 10;
            if(objs.get(i).x == 9)
            {
               objs.get(i).flow = Direction.LEFT;
            }
         }
      }
      
   }
   //prints the array of caught animals, useful for next step of data, can just do print for all values
   public void printCaught()
   {
      for(int i = 0; i < objs.size(); i ++)
      {
         if((objs.get(i).isCaught == true) &&(objs.get(i) instanceof Animal))
         {
            System.out.print(objs.get(i) + ", ");
         }
      }
   }
   
   public String toString()
   {
      return printBoard() + "Score: " + score;
   }
   
	public int measureObj() {
		return 0;
	}
	
	public int weighObj() {
		return 0;
	}
	
	public void addPoints(Entities obj) {
      if(obj instanceof Animal && obj.isCaught != true) 
      {
         score ++;
      }
      else if(obj instanceof Trash && obj.isCaught != true)
      {
         score --;
      }
   }
	//update method for standalone program, just moves player spot based
   public void update(String inp)
   {
      if(inp.equals("a"))
      {
         if(boat.x != 0)
         {
            boat.flow = Direction.LEFT;
            bucket.flow = Direction.LEFT;
            boat.x --;
            bucket.x --;
         }
      }
      else if(inp.equals("x"))
      {
         if(boat.x != 9)
         {
            boat.flow = Direction.STOP;
            bucket.flow = Direction.STOP;
         }
      }
      else if(inp.equals("d"))
      {
         if(boat.x != 9)
         {
            boat.flow = Direction.RIGHT;
            bucket.flow = Direction.RIGHT;
            bucket.x ++;
            boat.x ++;
         }
      }
      else if(inp.equals("s"))
      {
         if(bucket.y != 9)
         {
            boat.flow = Direction.STOP;
            bucket.flow = Direction.DOWN;
            bucket.y ++;
         }
      }
      else if(inp.equals("w"))
      {
         if(bucket.y != 1)
            {
               boat.flow = Direction.STOP;
               bucket.flow = Direction.UP;
               bucket.y --;
            }
      }
      moveObj(boat);
      moveObj(bucket);
   }
   
   //update to be used in cooperation with controller
	public void update(boolean moving, int score, Direction d, ArrayList<Entities> o) {}
	
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ModelR m = new ModelR();
      int i = 0;
      do {
            m.genObj();
            m.command = scanner.next();
            m.update(m.command);
            System.out.println(m);
         if(true)
         {
            m.increment();
            for(int j = 0; j < m.objs.size(); j++)
            {
               m.moveObj(m.objs.get(j));
            }
         }
      } while(!m.command.equals("p"));
      //System.out.println(m.objects);
      m.printCaught();
   }
	
	
}
