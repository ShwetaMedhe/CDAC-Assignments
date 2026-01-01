import React, { Component } from 'react';

class LifecycleDemo extends Component {
  constructor(props) {
    super(props);
    this.state = { count: 0 };
    console.log('constructor: Component is being constructed');
  }

  static getDerivedStateFromProps(props, state) {
    console.log('getDerivedStateFromProps: Syncing props to state');
    return null;
  }

  componentDidMount() {
    console.log(' componentDidMount: Component mounted to DOM');
  }

  shouldComponentUpdate(nextProps, nextState) {
    console.log('shouldComponentUpdate: Should component re-render?');
    return true;
  }

  getSnapshotBeforeUpdate(prevProps, prevState) {
    console.log(' getSnapshotBeforeUpdate: Capturing snapshot before update');
    return null;
  }

  componentDidUpdate(prevProps, prevState, snapshot) {
    console.log(' componentDidUpdate: Component updated');
  }

  componentWillUnmount() {
    console.log(' componentWillUnmount: Cleaning up before removal');
  }

  componentDidCatch(error, info) {
    console.log(' componentDidCatch: Error caught in component', error, info);
  }

 render() {
  return (
    <div>
      <h2>React Lifecycle Demo</h2>
      <p>Count: {this.state.count}</p>
      <button onClick={() => this.setState({ count: this.state.count + 1 })}>
        Increment
      </button>
    </div>
  );
}

}

export default LifecycleDemo;
