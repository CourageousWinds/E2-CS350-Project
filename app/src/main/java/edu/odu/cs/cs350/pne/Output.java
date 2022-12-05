package edu.odu.cs.cs350.pne;

public class Output {
    
    public void printOut(String[] args, char[] classifications){

        System.out.println(args);

        while (classifications[i]!= null){
            switch (classifications[i])) {
                case 'A':
                    System.out.println("A. General Literature \n");
                    break;
                
                case 'B':
                    System.out.println("B. Hardware\n");
                    break;
                
                case 'C':
                    System.out.println("C. Computer systems organization\n");
                    break;
                    
                case 'D':
                    System.out.println("D. Software\n");
                    break;
                
                case 'E':
                    System.out.println("E. Data\n");
                    break;
                    
                case 'F':
                    System.out.println("F. Theory of Computation\n");
                    break;
                    
                case 'G':
                    System.out.println("G. Mathematics of Computing\n");
                    break;
                    
                case 'H':
                    System.out.println("H. Information Systems\n");
                    break;
                    
                case 'I':
                    System.out.println("I. Computing and Methodologies\n");
                    break;
                    
                case 'J':
                    System.out.println("J. Computer Applications\n");
                    break;

                case 'K':
                    System.out.println("K. Computing Milieux\n");
                    break;
                
                default:
                    System.out.println("Failure to properly classify.\n");
                    break;
            };
        };
    };
};
