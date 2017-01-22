public int diff21(int n) {
  int r = 0;
  if (n <= 21) {
    r = 21 - n;
  } else {
    r = (n - 21) * 2;
  }
  return r;
}
