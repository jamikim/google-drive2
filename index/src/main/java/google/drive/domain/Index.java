package google.drive.domain;

import google.drive.domain.Indexed;
import google.drive.IndexApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Index_table")
@Data

public class Index  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        Indexed indexed = new Indexed(this);
        indexed.publishAfterCommit();

    }

    public static IndexRepository repository(){
        IndexRepository indexRepository = IndexApplication.applicationContext.getBean(IndexRepository.class);
        return indexRepository;
    }




    public static void fileIndex(FileUploaded fileUploaded){

        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        Indexed indexed = new Indexed(index);
        indexed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);

            Indexed indexed = new Indexed(index);
            indexed.publishAfterCommit();

         });
        */

        
    }


}
