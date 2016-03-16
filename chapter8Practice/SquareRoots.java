public class SquareRoots
{
    
    
    public static double squareRoot(double x)
    {
        return helper(x,1);
        
        
    }
    
    public static double helper(double x, double g)
    {
        if (Math.abs(Math.pow(g,2)-x)<0.05)
        {
            return g;
        }
        return helper(x,(g+x/g)/2);
    }
}