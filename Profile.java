public class Profile{

    private int id;
    private String name;
    private String phoneNum;
    private String address;
    private String email;
    
    public Profile(int id,String name, String phoneNum, String address, String email){
        this.id=id;
        this.name = name;
    this.phoneNum = phoneNum;
    this.address = address;
    this.email = email;
    }

    public int getId(){
        return id;
    }

    public String getName(){
      return name;
    }

    public String getPhoneNum(){
       return phoneNum;
    }

    public String getAddress(){
      return address;
    }

    public String getEmail(){
      return email;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPhoneNum(String phoneNum){
        this.phoneNum=phoneNum;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public void setEmail(String email){
        this.email=email;
    }

    @Override 
    public String toString(){
        return "Profile{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", phoneNum='" + phoneNum + '\'' +
            ", address='" + address + '\'' +
            ", email='" + email + '\'' +
            '}';
    }
}             
