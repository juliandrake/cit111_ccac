/*
 * Copyright 2020 julian.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package objectifiedarrays;

/**
 * Represents an Erlenmeyer flask
 * @author julian
 */
public class Flask {
    
    // member variables
    private double totalCapacity;
    private double currentVolume;
    private String material;
    
    // getters and setters for member variables
    public double getTotalCapacity() {
        return totalCapacity;
    } // close method getTotalCapacity

    public void setTotalCapacity(double totalCapacity) {
        this.totalCapacity = totalCapacity;
    } // close method setTotalCapacity

    public double getCurrentVolume() {
        return currentVolume;
    } // close method getCurrentCapacity

    public void setCurrentVolume(double currentVolume) {
        this.currentVolume = currentVolume;
    } // close method setCurrentVolume

    public String getMaterial() {
        return material;
    } // close method getMaterial

    public void setMaterial(String material) {
        this.material = material;
    } // close method setMaterial
    
} // close class Flask
