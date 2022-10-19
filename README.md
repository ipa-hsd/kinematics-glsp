# kinematics-glsp
Graphical edittor for kinematics model defined in https://github.com/ipa320/kinematics-model (branch: `lsp_support`)  

![Screenshot from 2022-10-19 15-59-39](https://user-images.githubusercontent.com/31062848/196619557-cf8ae2d1-af0a-4d0b-afcd-6db2642252d4.png)


To use text editor: https://github.com/ipa-hsd/vscode-kinematics-model

### Build
#### Clone repo
```
git clone git@github.com:ipa-hsd/kinematics-glsp.git
cd kinematics-glsp/glsp-server
```
#### Build server with `maven`
```
mvn clean install -U
```
#### Build client with `yarn`
```
cd kinematics-glsp/glsp-client
nvm use 12
yarn
```
### Usage
```
cd kinematics-glsp/glsp-client
yarn start
```
Open browser and type [http://localhost:3000](http://localhost:3000)
