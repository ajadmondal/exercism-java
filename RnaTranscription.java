class RnaTranscription {

    String transcribe(String dnaStrand) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String rnaStrand = "";
        for(int i = 0; i < dnaStrand.length(); i++){
            char c = dnaStrand.charAt(i);
            if(c == 'A'){
                rnaStrand = rnaStrand + "U";
            }
            else if(c == 'T'){
                rnaStrand = rnaStrand + "A";
            }
            else if(c == 'C'){
                rnaStrand = rnaStrand + "G";
            }
            else if(c == 'G'){
                rnaStrand = rnaStrand + "C";
            }
        
        }
        return rnaStrand;
    }

}