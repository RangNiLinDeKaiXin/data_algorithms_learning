package com.lcc.sort;

/**
 * @author: lcc
 * @Date: 2018-06-21
 **/
public class intsort {

  public static void main(String[] args) {
    int[] a = new int[]{1, 12, 13, 9, 9, 15, 19, 27};
    jiandan(a);

  }




  public static void jiandan(int[] a) {

    for (int i = 0; i < a.length; i++) {
      int temp = a[i];
      int p = i;
      int j = i + 1;
      for (; j < a.length; j++) {
        if (a[j] < temp) {
          p = j;
          temp = a[j];
        }

      }
      a[p] = a[i];
      a[i] = temp;

    }


    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }


  public static void maopao(int[] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length - 1; j++) {
        int temp = 0;
        if (a[j + 1] < a[j]) {
          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }


  public static void zhijiecharu(int[] a) {
    for (int i = 1; i < a.length; i++) {
      int temp = a[i];
      int j = i - 1;
      for (; j >= 0 && temp < a[j]; j--) {
        a[j + 1] = a[j];
      }
      a[j + 1] = temp;
    }

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }


  public static int erfenfa(int[] a, int key, int low, int hieght) {

    int mid = (low + hieght) / 2;

    if (mid < 0 || mid > hieght - 1) {
      return -1;
    }
    if (a[mid] == key) {
      return mid;
    }
    if (a[mid] > key) {
      return erfenfa(a, key, 0, mid - 1);
    }
    if (a[mid] < key) {
      return erfenfa(a, key, mid + 1, hieght);
    }

    return -1;

  }

}

