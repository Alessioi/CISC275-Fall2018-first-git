# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
  1. The arraylist
  2. new dog1
  3. new dog2 
  4. new dog3
  5. comparator 

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?
  new Comparator <Animal>
    Class definition of comparator 
   public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs(); }
