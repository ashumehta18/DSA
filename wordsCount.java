class Result {
  static int countWords(String str) {
    str = str.trim();
    if (str.isEmpty()) {
      return 0;
    } else {
      String[] words = str.split("\\s+");
      return words.length;
    }
  }
}
