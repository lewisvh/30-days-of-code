// Add your code here
  public Difference(int[] a) {
    this.elements = a;
  }

  public void computeDifference(){
    Arrays.sort(elements);
    maximumDifference = (elements[elements.length - 1] - elements[0]);
  }