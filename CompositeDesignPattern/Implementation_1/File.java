package LowLevelDesign.vamsiPractise.CompositeDesignPattern.Implementation_1;

public class File implements FileSystem{
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void ls(){
        System.out.println("File Name is "+fileName);
    }

}
