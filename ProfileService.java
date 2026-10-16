
import java.util.List;

public class ProfileService {

    private ProfileRepository repository;

    public ProfileService(ProfileRepository repository) {
        this.repository = repository;
    }

    public void addProfile(Profile profile) {
        if(repository.findById(profile.getId())!=null){
            System.out.println("Profile ID already exists!");
            return;
        }
        repository.save(profile);
    }

    public Profile getProfile(int id) {
        return repository.findById(id);
    }

    public List<Profile> getProfiles() {
        return repository.findAll();
    }

    public void removeProfile(int id) {
        repository.delete(id);
    }

    public void updateProfile(
            int id,
            String name,
            String phoneNum,
            String address,
            String email) {

        Profile profile = repository.findById(id);

        if (profile != null) {
            profile.setName(name);
            profile.setPhoneNum(phoneNum);
            profile.setAddress(address);
            profile.setEmail(email);
        }
    }
}
