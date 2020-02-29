
package objectpassingtomethod.instance.and.pkgstatic;
/**
 *
 * @author Durjoy
 */
public class Box {
    int width;
    int height;
    Box(int w,int h)
    {
        width = w;
        height = h;
    }
    Box(Box b)
    {
        this.width = b.width;
        this.height = b.height;
    }
    boolean isEqual(Box b)
    {
        if(this.width == b.width && this.height==b.height)
            return true;
        else
            return false;        
    }
    static boolean isTwoObjectsEqual(Box b1,Box b2)
    {
        if(b1.width == b2.width && b1.height==b2.height)
            return true;
        else
            return false;
        
    }
    void display()
    {
        System.out.println("width is"+this.width +"and height is"+this.height);
    }
}
