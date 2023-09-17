public class Codec {

  
    Map<String, String> map = new HashMap<>();
   

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String prefix = "http://tinyurl.com";
        String[] parts = longUrl.split("/");
        StringBuilder temp = new StringBuilder();
        int i = 0;
        Random rand = new Random();
        char ch = 'a';
        while(++i <= parts[parts.length-1].length()){
            ch = (char) (rand.nextInt(26) + 'a');
            temp.append(ch);
        }
        String tinyUrl = prefix + temp.toString();
        if(map.containsKey(tinyUrl)){
            int num = rand.nextInt(10000);
            tinyUrl += num;
        }else{
            map.put(tinyUrl, longUrl);
        }
        return tinyUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));