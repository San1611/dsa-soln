class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves=0;
        for(int i=0;i<seats.length;i++){
            moves+=Math.max(seats[i],students[i])- Math.min(seats[i],students[i]);

        }

        return moves;
        
    }
}