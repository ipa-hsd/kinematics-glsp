# kinematics-glsp
Graphical edittor for kinematics DSL defined in https://github.com/ipa320/kinematics-model (branch: `lsp_support`)  
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
