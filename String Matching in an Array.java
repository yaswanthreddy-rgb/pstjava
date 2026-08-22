class Solution {
  public List<String> stringMatching(String[] words) {
    Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
    List<String> result = new ArrayList<>();
    // System.out.println(Arrays.toString(words));

    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        // System.out.println(words[j] + " " + words[i]);
        if (words[j].contains(words[i])) {
          result.add(words[i]);
          break;
        }
      }
    }

    return result;
  }
}
