final class File {
    private Double totalLength;
    private Double sentLength;

    public Double getSentLengthPercentage() {
        return sentLength * 100 / totalLength;
    }
}