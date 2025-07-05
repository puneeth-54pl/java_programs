
        for (int i = n; i >= 1; i--) {
            rightToLeft += 1.0 / i;
        }

        System.out.println("Left-to-right sum: " + leftToRight);
        System.out.println("Right-to-left sum: " + rightToLeft);
        System.out.println("Absolute difference: " + Math.abs(leftToRight - rightToLeft));
        System.out.println("More accurate sum: Right-to-left (smaller terms added first)");