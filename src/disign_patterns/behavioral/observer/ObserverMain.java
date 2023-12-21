package disign_patterns.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        SpreadSheet sheet1 = new SpreadSheet(dataSource);
        SpreadSheet sheet2 = new SpreadSheet(dataSource);
        Chart chart = new Chart(dataSource);
        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);
        dataSource.setValue(1);
    }
}
