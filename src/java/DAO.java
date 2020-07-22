/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sakshi Sinha
 */
import redis.clients.jedis.Jedis;
public class DAO 
{
    Jedis jedis=new Jedis("localhost");
    public void checkcon()
    {
        System.out.println("Connection Check!");
        System.out.println(jedis.ping());
    }
    public void addUser(User user)
    {
       //Creating a data point
       jedis.set(Integer.toString(user.getID()),user.getName());
       System.out.println("Data Point Created");
    }
    public String getUser(Integer ID)
    {
        //Reading info about a data point
        String Name=jedis.get(Integer.toString(ID));
        //Also displaying all the information we have
        return Name;
    }
    public static void main(String[] args)
    {
      Jedis jedis = new Jedis("localhost");
      System.out.println("Connected");
      System.out.println(jedis.ping());
    }
}
