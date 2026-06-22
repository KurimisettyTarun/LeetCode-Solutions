class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=1;
        int a=1;
        int l=2;
        int o=2;
        int n=1;
         Map<Character,Integer> map = new HashMap<>();
        for(char c : text.toCharArray())
        {
            if(c=='b'||c=='a'||c=='l'||c=='o'||c=='n')
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
            int count = 0;
        while (map.getOrDefault('b', 0) >= 1 &&
            map.getOrDefault('a', 0) >= 1 &&
            map.getOrDefault('l', 0) >= 2 &&
            map.getOrDefault('o', 0) >= 2 &&
            map.getOrDefault('n', 0) >= 1) {

            count++;
            map.put('b', map.get('b') - 1);
            map.put('a', map.get('a') - 1);
            map.put('l', map.get('l') - 2);
            map.put('o', map.get('o') - 2);
            map.put('n', map.get('n') - 1);
        }
        return count;

    }
}