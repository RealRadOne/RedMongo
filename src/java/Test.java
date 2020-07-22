import redis.clients.jedis.Jedis;
public class Test 
{
//This is the testing place
    public static void main(String args[])
    {
        DAO ds=new DAO();
        ds.checkcon();
    }
}
