public class ProfileService{

    private ProfileRepository repository;

    public ProfileService(ProfileRepository repository){
        this.repository=repository;
    }

    private void addProfile(Profile profile){
        profiles.add(profile);
    }

    private void removeProfile(Profile profile){
        profiles.remove(profile);
    }

    public List<Profile> getProfiles(){
        return profiles;
    }

  public void updateProfile(Profile profile, String name, String phoneNum, String address, String email){
        profile.setName(name);
        profile.setPhoneNum(phoneNum);
        profile.setAddress(address);
        profile.setEmail(email);
    }
}
