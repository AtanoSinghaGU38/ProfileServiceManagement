import java.util.ArrayList;
import java.util.List;

public class ProfileRepository{

    private List<Profile> profiles= new ArrayList<>();

    public void save(Profile profile){
        profiles.add(profile);
    }

    public Profile findById(int Id){
        for(Profile profile: profiles){
            if(profile.getId()==Id){
                return profile;
            }
        }
        return null;
    }

    public void delete(int id){
        Profile profile=findById(id);
        if(profile!=null){
            profiles.remove(profile);
        }
    }

    public List<Profile> findAll(){
        return profiles;
    }
}

