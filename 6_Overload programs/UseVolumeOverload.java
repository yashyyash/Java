
package abc;


class UseVolumeOverload 
{
    public static void main(String[] args) 
    {
       VolumeOverload v=new VolumeOverload();
       
        System.out.println("Volume of Rectangle is "+v.volume(100,75,15));
        System.out.println("Volume of Cylinder is "+v.volume(2.5,8));
        System.out.println("Volume of Cube is "+v.volume(10));
    }
}
