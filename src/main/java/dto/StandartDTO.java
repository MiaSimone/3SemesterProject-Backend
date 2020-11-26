
package dto;

import entities.Photo;
import entities.PhotoCandidates;
import java.util.List;

/**
 *
 * @author miade
 */
public class StandartDTO {
    
    private String time;
    
    private RealtorDTO realtorDTO;
    
    private String placeID;
    private List<String> photoRefs;
    
    public StandartDTO(RealtorDTO realtorDTO, String time) {
        this.time = time;
        this.realtorDTO = realtorDTO;
    }

    public StandartDTO(String placeID, String time) {
        this.time = time;
        this.placeID = placeID;
    }
    
    public StandartDTO(List<String> photoRefs, String time) {
        this.time = time;
        this.photoRefs = photoRefs;
    }
    
}
