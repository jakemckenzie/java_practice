public String starString(int star) {
    if (star < 0) throw new IllegalArgumentException();
    return (star <= 0) ? "*" : starString(star - 1) + starString(star - 1);
}