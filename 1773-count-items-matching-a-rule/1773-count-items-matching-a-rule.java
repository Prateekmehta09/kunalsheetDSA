class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue)
    {
        int count=0;
        for(List<String> str: items)
        {
            String type= str.get(0);
            String color=str.get(1);
            String name=str.get(2);
            if("type".equals(ruleKey)&& type.equals(ruleValue))
            {
                count++;
            }
             else if("color".equals(ruleKey)&&color.equals(ruleValue))
            {
                count++;
            }
            else  if("name".equals(ruleKey)&&name.equals(ruleValue))
            {
                count++;
            }
            
        }
         return count;
    }
}