package org.podpage.worte;

import org.json.JSONObject;

public class WorteResult {

    private Score score;
    private ZIndex zindex;

    public WorteResult(JSONObject json) {
        JSONObject scoreJson = json.getJSONObject("score");
        JSONObject zindexJson = json.getJSONObject("zindex");
        score = new Score(scoreJson);
        zindex = new ZIndex(zindexJson);
    }

    public Score getScore() {
        return score;
    }

    public ZIndex getZindex() {
        return zindex;
    }

    @Override
    public String toString() {
        return "WorteResult{" +
                "score=" + score +
                ", zindex=" + zindex +
                '}';
    }

    public static class Score {
        private double you;
        private double negAchieve;
        private double achieve;
        private double posEmo;
        private double posAffil;
        private double affil;
        private double adverb;
        private double preposition;
        private double article;
        private double posAchieve;
        private double reward;
        private double negAffil;
        private double we;
        private double negPower;
        private double power;
        private double discrep;
        private double personalPronouns;
        private double negEmo;
        private double shehe;
        private double relativ;
        private double posPower;
        private double ich;

        public Score(JSONObject json) {
            you = json.getDouble("you");
            negAchieve = json.getDouble("negAchieve");
            achieve = json.getDouble("achieve");
            posEmo = json.getDouble("posEmo");
            posAffil = json.getDouble("posAffil");
            affil = json.getDouble("affil");
            adverb = json.getDouble("adverb");
            preposition = json.getDouble("preposition");
            article = json.getDouble("article");
            posAchieve = json.getDouble("posAchieve");
            reward = json.getDouble("reward");
            negAffil = json.getDouble("negAffil");
            we = json.getDouble("we");
            negPower = json.getDouble("negPower");
            power = json.getDouble("power");
            discrep = json.getDouble("discrep");
            personalPronouns = json.getDouble("personalPronouns");
            negEmo = json.getDouble("negEmo");
            shehe = json.getDouble("shehe");
            relativ = json.getDouble("relativ");
            posPower = json.getDouble("posPower");
            ich = json.getDouble("ich");
        }

        public double getYou() {
            return you;
        }

        public double getNegAchieve() {
            return negAchieve;
        }

        public double getAchieve() {
            return achieve;
        }

        public double getPosEmo() {
            return posEmo;
        }

        public double getPosAffil() {
            return posAffil;
        }

        public double getAffil() {
            return affil;
        }

        public double getAdverb() {
            return adverb;
        }

        public double getPreposition() {
            return preposition;
        }

        public double getArticle() {
            return article;
        }

        public double getPosAchieve() {
            return posAchieve;
        }

        public double getReward() {
            return reward;
        }

        public double getNegAffil() {
            return negAffil;
        }

        public double getWe() {
            return we;
        }

        public double getNegPower() {
            return negPower;
        }

        public double getPower() {
            return power;
        }

        public double getDiscrep() {
            return discrep;
        }

        public double getPersonalPronouns() {
            return personalPronouns;
        }

        public double getNegEmo() {
            return negEmo;
        }

        public double getShehe() {
            return shehe;
        }

        public double getRelativ() {
            return relativ;
        }

        public double getPosPower() {
            return posPower;
        }

        public double getIch() {
            return ich;
        }

        @Override
        public String toString() {
            return "Score{" +
                    "you=" + you +
                    ", negAchieve=" + negAchieve +
                    ", achieve=" + achieve +
                    ", posEmo=" + posEmo +
                    ", posAffil=" + posAffil +
                    ", affil=" + affil +
                    ", adverb=" + adverb +
                    ", preposition=" + preposition +
                    ", article=" + article +
                    ", posAchieve=" + posAchieve +
                    ", reward=" + reward +
                    ", negAffil=" + negAffil +
                    ", we=" + we +
                    ", negPower=" + negPower +
                    ", power=" + power +
                    ", discrep=" + discrep +
                    ", personalPronouns=" + personalPronouns +
                    ", negEmo=" + negEmo +
                    ", shehe=" + shehe +
                    ", relativ=" + relativ +
                    ", posPower=" + posPower +
                    ", ich=" + ich +
                    '}';
        }
    }

    public static class ZIndex {
        private double you;
        private double negAchieve;
        private double achieve;
        private double posEmo;
        private double posAffil;
        private double affil;
        private double adverb;
        private double preposition;
        private double article;
        private double posAchieve;
        private double reward;
        private double negAffil;
        private double we;
        private double negPower;
        private double power;
        private double discrep;
        private double personalPronouns;
        private double negEmo;
        private double shehe;
        private double relativ;
        private double posPower;
        private double ich;

        public ZIndex(JSONObject json) {
            you = json.getDouble("you");
            negAchieve = json.getDouble("negAchieve");
            achieve = json.getDouble("achieve");
            posEmo = json.getDouble("posEmo");
            posAffil = json.getDouble("posAffil");
            affil = json.getDouble("affil");
            adverb = json.getDouble("adverb");
            preposition = json.getDouble("preposition");
            article = json.getDouble("article");
            posAchieve = json.getDouble("posAchieve");
            reward = json.getDouble("reward");
            negAffil = json.getDouble("negAffil");
            we = json.getDouble("we");
            negPower = json.getDouble("negPower");
            power = json.getDouble("power");
            discrep = json.getDouble("discrep");
            personalPronouns = json.getDouble("personalPronouns");
            negEmo = json.getDouble("negEmo");
            shehe = json.getDouble("shehe");
            relativ = json.getDouble("relativ");
            posPower = json.getDouble("posPower");
            ich = json.getDouble("ich");
        }

        public double getYou() {
            return you;
        }

        public double getNegAchieve() {
            return negAchieve;
        }

        public double getAchieve() {
            return achieve;
        }

        public double getPosEmo() {
            return posEmo;
        }

        public double getPosAffil() {
            return posAffil;
        }

        public double getAffil() {
            return affil;
        }

        public double getAdverb() {
            return adverb;
        }

        public double getPreposition() {
            return preposition;
        }

        public double getArticle() {
            return article;
        }

        public double getPosAchieve() {
            return posAchieve;
        }

        public double getReward() {
            return reward;
        }

        public double getNegAffil() {
            return negAffil;
        }

        public double getWe() {
            return we;
        }

        public double getNegPower() {
            return negPower;
        }

        public double getPower() {
            return power;
        }

        public double getDiscrep() {
            return discrep;
        }

        public double getPersonalPronouns() {
            return personalPronouns;
        }

        public double getNegEmo() {
            return negEmo;
        }

        public double getShehe() {
            return shehe;
        }

        public double getRelativ() {
            return relativ;
        }

        public double getPosPower() {
            return posPower;
        }

        public double getIch() {
            return ich;
        }

        @Override
        public String toString() {
            return "ZIndex{" +
                    "you=" + you +
                    ", negAchieve=" + negAchieve +
                    ", achieve=" + achieve +
                    ", posEmo=" + posEmo +
                    ", posAffil=" + posAffil +
                    ", affil=" + affil +
                    ", adverb=" + adverb +
                    ", preposition=" + preposition +
                    ", article=" + article +
                    ", posAchieve=" + posAchieve +
                    ", reward=" + reward +
                    ", negAffil=" + negAffil +
                    ", we=" + we +
                    ", negPower=" + negPower +
                    ", power=" + power +
                    ", discrep=" + discrep +
                    ", personalPronouns=" + personalPronouns +
                    ", negEmo=" + negEmo +
                    ", shehe=" + shehe +
                    ", relativ=" + relativ +
                    ", posPower=" + posPower +
                    ", ich=" + ich +
                    '}';
        }
    }
}
