package bd.com.ronnie.hacking.leetcode.defranging_an_ip_address;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        String result = defangIPaddr(address);
        System.out.println(result);
    }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}

// https://leetcode.com/problems/defanging-an-ip-address/