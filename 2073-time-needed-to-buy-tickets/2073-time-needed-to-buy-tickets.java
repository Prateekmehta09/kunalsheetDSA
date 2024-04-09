class Solution {
    public int timeRequiredToBuy(int[] tickets, int k)
    {
         int time = 0;

        for (int i = 0; i < tickets.length; i++) {
            time += Math.min(tickets[i], tickets[k]);
        }

        for (int i = tickets.length - 1; i > k; i--) {
            if (tickets[i] >= tickets[k]) {
                time--;
            }
        }

        return time;
    }
}