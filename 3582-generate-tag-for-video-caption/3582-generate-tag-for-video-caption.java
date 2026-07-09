class Solution {
    public String generateTag(String caption) {
        caption=caption.trim().toLowerCase();
        if(caption.length()==0)return "#";
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(String.valueOf(Character.toLowerCase(caption.charAt(0))));

        String spl = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        for(int i=1;i<caption.length();i++)
        {
            if(caption.charAt(i)==' ')continue;
            else if(spl.contains(String.valueOf(caption.charAt(i))))
            {
                continue;
            }
            if(caption.charAt(i-1)==' ')
            {
                sb.append(String.valueOf(Character.toUpperCase(caption.charAt(i))));
            }
            else
            sb.append(String.valueOf(caption.charAt(i)));

        }
        String res = sb.toString();
        return res.length()>100?res.substring(0,100):res;
    }
}