# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?

a. The arraylist of dogs 

b. first dog added, Fido, 4 legs

c. second dog added, Fido, 3 legs

d. third dog added, Alfie, 4 legs 

e. The comparator 

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?

Around the middle of the main, the comparator constructor can be seen. 

  new Comparator Animal 
  
    @Override
    
   public int compare(Animal a, Animal b){
   
			    return a.getLegs() - b.getLegs(); }
