
String getEntry() {
    String mdCountryCSV = "/WorldPopulation/Metadata_Country_API_SP.POP.TOTL_DS2_en_csv_v2_4493645.csv"
    new File(
            getClass()/*run-time call opf 'this' instance */
                .getResource( /* reads some file-named resource from the resource bundle created on start of the application */
                    mdCountryCSV).toString() /* the file-name of the resource*/
                ).withReader { reader ->
                    reader.eachLine { line ->
                        println line
                    }
                }
    return "done"
}

static void main(String[] args) {
  println new App().entry
}




