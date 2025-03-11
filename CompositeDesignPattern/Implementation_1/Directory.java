package LowLevelDesign.vamsiPractise.CompositeDesignPattern.Implementation_1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    List<FileSystem> fileSystems;
    String directoryName;
    public Directory(String directoryName) {
        fileSystems = new ArrayList<FileSystem>();
        this.directoryName = directoryName;
    }

    public void add(FileSystem fileSystem){
        fileSystems.add(fileSystem);
    }

    public void ls(){
        System.out.println("Directory Name is " +directoryName);
        for(FileSystem fileSystemObj : fileSystems){
            fileSystemObj.ls();
        }
    }
}
